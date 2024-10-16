package com.example.ElectronicStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ElectronicStoreApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ElectronicStoreApplication.class, args);
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application Started");
		System.out.println(passwordEncoder.encode("ankit123"));
		System.out.println("Pushed it");
	}

}


