package com.app.user;

import java.util.List;
import java.util.Optional;

import com.app.user.entity.UserInfo;
import com.app.user.vo.UserRequestVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserService {
	
	private UserRepository userRepository;
	
	
	
	public UserService(UserRepository userRepository, List<UserInfo> users) {
		super();
		this.userRepository = userRepository;
		this.users = users;
	}

	private List<UserInfo> users;
	
	public List<UserInfo> getUsers(){
		return users;
	}
	
	public UserInfo getUser(String userId) {
		//return users.parallelStream().filter(user -> user.getUserId().equals(userId)).findAny().get();
		Optional<UserInfo> user = userRepository.findById(userId);
		user.ifPresent(value ->log.debug("User {} found",value.getFirstName()));
		return user.orElseGet(() -> new UserInfo());
	}
	
	public UserRequestVO saveUser(UserRequestVO requestVO) {
		return new UserRequestVO(userRepository.save(requestVO.getUser()));
	}
	

}
