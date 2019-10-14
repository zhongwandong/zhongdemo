package com.zhong.login.service;

import com.zhong.User.pojo.User;

public interface LoginService {
	/**
	 * 校验用户是否存在
	 * @param user
	 * @return
	 */
	public Boolean validateUser(User user);
}
