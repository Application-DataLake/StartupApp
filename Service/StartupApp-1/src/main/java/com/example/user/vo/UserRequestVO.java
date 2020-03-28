package com.app.user.vo;

import java.io.Serializable;

import com.app.user.entity.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8546770227433062085L;
	
	UserInfo user;

}
