package com.app.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	
	
	private String userId;
	private String userType;
	private String firstName;
	@JsonIgnore
	private String middleName;
	private String lastName;
	@JsonIgnore
	private String email;
	@JsonIgnore
	private String phone;
	private String phoneCountryCode;
	@JsonIgnore
	private String address;
	private String preferredCity;
	
	
	
}
