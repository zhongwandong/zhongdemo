package com.zhong.school.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zhong.common.base.BaseAction;
import com.zhong.school.pojo.School;

@Controller
@RequestMapping("/zhong/school/*")
public class SchoolAction extends BaseAction{
	public static Logger lo=Logger.getLogger(SchoolAction.class);
	@RequestMapping("schoolAdd")
	public ModelAndView add(School school) {
		try {
			throw new Exception("不好了!");
		}catch(Exception e) {
			lo.error(e);
		}
		System.out.println(school);
		return new ModelAndView("schoolLogin.jsp");
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(HttpServletRequest request,@RequestParam("ids") int id,HttpServletResponse response) {
		System.out.println("request="+request.getContextPath());
		System.out.println("session="+request.getSession().getId());
		System.out.println("response="+response.getContentType());
		System.out.println(id);
		return null;
	}
	
}
