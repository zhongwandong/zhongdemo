package com.zhong.common.base;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class BaseAction {
	@Resource
	private ResourceBundleMessageSource msgSource;
	
	/**
	 * springMVC将时间转化
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
	}
	
	public String getBaseNames() {
//		String str=msgSource.getMessage("yourName", null,Locale.getDefault());
		return "";
	}
}
