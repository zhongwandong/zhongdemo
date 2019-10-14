package com.zhong.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhong.User.pojo.User;
import com.zhong.login.dao.LoginDao;
import com.zhong.login.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao<User> loginDao;
	
	public Boolean validateUser(User user) {
		List<User> userList=loginDao.getAll(user);
		if(userList.size()>0) {
			return true;
		}
		return false;
	}
	

}
