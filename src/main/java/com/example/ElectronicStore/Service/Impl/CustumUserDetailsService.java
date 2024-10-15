package com.example.ElectronicStore.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.ElectronicStore.Entities.User;
import com.example.ElectronicStore.Exception.ResourceNotFoundException;
import com.example.ElectronicStore.Repository.UserRepository;

@Service
public class CustumUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= userRepo.findByUserEmail(username).orElseThrow(() -> new ResourceNotFoundException("User Not Found"));
		return user;
	}

}
