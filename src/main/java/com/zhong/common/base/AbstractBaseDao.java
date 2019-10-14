package com.zhong.common.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AbstractBaseDao<T>{
	@Autowired
	private JdbcTemplate template;

	public List<T> getResult(Class<T> clazz,String sql,Object... values){
		
		return template.query(sql, BeanPropertyRowMapper.newInstance(clazz));
	}

}
