package com.zhong.login.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhong.User.pojo.User;
import com.zhong.common.base.AbstractBaseDao;
import com.zhong.login.dao.LoginDao;

@Repository
public class LoginDaoImpl extends AbstractBaseDao<User> implements LoginDao<User>{

	public List<User> getAll(User t) {
		StringBuffer sql = new StringBuffer();
		sql.append(" select * from USER");
		List<User> result = super.getResult(User.class, sql.toString());
		return result;
		
	}


	
	
}
