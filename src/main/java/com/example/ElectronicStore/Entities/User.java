package com.example.ElectronicStore.Entities;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

//Beautiful application of lombak -> Automatically create all getter and setters
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name = "users")
public class User implements UserDetails {
	@Id
	private String userId;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="User_Email", unique=true)
	private String userEmail;
	
	@Column(name="User_Password", length=500)
	private String userPassword;
	
	@Column(name="User_Gender",length=10)
	private String userGender;
	
	@Column(name="User_Image_Name")
	private String userImageName;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.userPassword;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.userEmail;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	

}
