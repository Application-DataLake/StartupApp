package com.app.user;

import java.util.List;

import com.app.user.entity.UserInfo;

public class UserServiceImpl implements IUserService{
	
	private List<UserInfo> users;
	public UserServiceImpl(List<UserInfo> users) {
		this.users = users;    
	}
	
	@Override
	public List<UserInfo> getUsers(){
		return users;
	}
	
	@Override
	public UserInfo getUser(String userId) {
		return users.parallelStream().filter(user -> user.getUserId().equals(userId)).findAny().get();
		  
	}
	

}
