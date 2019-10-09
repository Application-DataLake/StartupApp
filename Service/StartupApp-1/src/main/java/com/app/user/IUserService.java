package com.app.user;

import java.util.List;

import com.app.user.entity.UserInfo;

public interface IUserService {

	public UserInfo getUser(String userId);
	public List<UserInfo> getUsers();
}
