package com.zhong.demo.cglib;

import com.zhong.User.pojo.User;

public class UserServiceImpl {

	 public User getUserById(Long id){  
			User user =	 new User();
			user.setName("nihaoa");
	        return user;  
	    }  
}
