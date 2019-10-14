package com.zhong.login.dao;

import java.util.List;


public interface LoginDao<T> {
	public List<T> getAll(T t) ;
}
