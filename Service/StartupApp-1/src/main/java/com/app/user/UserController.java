package com.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.user.entity.UserInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/user/{userId}")
	public UserInfo getUser(@PathVariable("userId") String userId) {
		log.info("User details of userId : {}" , userId);
		return userService.getUser(userId);
	}
}
