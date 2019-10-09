package com.app.user.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class UserInfo {
	
	private String userId;
	private String userType;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String phone;
	private String phoneCountryCode;
	private String address;
	private String preferredCity;
	
	
	
}
