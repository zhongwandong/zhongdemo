package com.zhong.demo.cglib;

import java.util.Optional;

import com.zhong.User.pojo.User;

public class Test {

	   public static void main(String[] args) {  
	        UserServiceImpl userService = new UserServiceImpl();  
	        UserServiceImplCGLIB cglib = new UserServiceImplCGLIB();  
	        UserServiceImpl proxy = cglib.getInstance(userService, UserServiceImpl.class);  
	        
	        User user = proxy.getUserById(100L);  
	          
	        String username = Optional.of(user).map(u -> u.getName()).orElse("");  
	        System.out.println(username);  
	    }  
}
