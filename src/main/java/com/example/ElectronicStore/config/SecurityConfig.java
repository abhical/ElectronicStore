package com.example.ElectronicStore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig {

	@Autowired
	private UserDetailsService userDetailsService;

//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails NormalUser = User.builder().username("Abhishek").password(passwordEncoder().encode("abhishek123"))
//				.roles("Normal").build();
//		UserDetails AdminUser = User.builder().username("Pandey").password(passwordEncoder().encode("pandey123"))
//				.roles("Admin").build();
//
//		return new InMemoryUserDetailsManager(NormalUser, AdminUser);
//	}
	
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(this.userDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
//
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	} 
}
