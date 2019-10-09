package com.app.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.user.entity.UserInfo;

@RestController
public class UserController {

	@RequestMapping("/user")
	public UserInfo getUser() {
		UserInfo user = new UserInfo();
		user.setFirstName("Sankalp");
		return user;
	}
}
