package com.app.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.user.entity.UserInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

	private IUserService userService;
	
	public UserController(IUserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(path = "/user/{}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfo getUser(@PathVariable String userId) {
		log.info("User details of userId : {}" , userId);
		return userService.getUser(userId);
	}
}
