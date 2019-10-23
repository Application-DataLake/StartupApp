package com.app.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.user.entity.UserInfo;
import com.app.user.vo.UserRequestVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{userId}")
	public UserInfo getUser(@PathVariable("userId") String userId) {
		log.info("User details of userId : {}" , userId);
		return userService.getUser(userId);
	}
	
	@PutMapping
	public UserRequestVO saveUser(@RequestBody UserRequestVO requestVO) {
		log.info("RequestVo : {}", requestVO);
		return userService.saveUser(requestVO);
	}
}
