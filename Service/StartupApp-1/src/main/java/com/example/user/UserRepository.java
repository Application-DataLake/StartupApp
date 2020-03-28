package com.app.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.user.entity.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, String> {}
