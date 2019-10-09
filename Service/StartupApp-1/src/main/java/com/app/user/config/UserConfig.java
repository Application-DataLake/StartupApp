package com.app.user.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.user.UserServiceImpl;
import com.app.user.entity.UserInfo;

@Configuration
public class UserConfig {
	

	@Bean
	public UserServiceImpl getUserService() {
		UserInfo p1 = new UserInfo("1", "L", "SANKALP", "JAI SURYA", "BHATT", "SANKALPBHATT123@GMAIL.COM", "73549760616", "91", "Mira Road", "Mumbai");
		UserInfo p2 = new UserInfo("2", "B", "Dheeraj", "", "Wadhwani", "dheerajwadhwani10@gmail.com", "1234567890", "91", "Noida","Mumbai");
		List<UserInfo> users = new ArrayList<UserInfo>();
		users.add(p1);
		users.add(p2);
		return new UserServiceImpl(users);
		
	}


	
}
