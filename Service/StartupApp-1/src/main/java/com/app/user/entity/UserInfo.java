package com.app.user.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class UserInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8730171164148480707L;
	@Id
	private String userId;
	private String userType;
	private String firstName;
	@JsonIgnore
	private String middleName;
	private String lastName;
	private String email;
	private String phone;
	private String phoneCountryCode;
	@JsonIgnore
	private String address;
	private String preferredCity;
	
	
	
}
