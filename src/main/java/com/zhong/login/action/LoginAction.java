package com.zhong.login.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.validation.Valid;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.zhong.User.pojo.User;
import com.zhong.annotate.LogAnnotate;
import com.zhong.common.base.BaseAction;
import com.zhong.common.enums.LogType;
import com.zhong.login.service.LoginService;


@Controller
@RequestMapping("login/*")
public class LoginAction  extends BaseAction{
	public static Logger lo=Logger.getLogger(LoginAction.class);
	@Autowired
	private LoginService loginService;
	@RequestMapping("check")
	@LogAnnotate(value=LogType.WARNS)
	public ModelAndView check(@Valid User user) {
		try {
			lo.error("不好了");
			System.out.println(user.getName());
			System.out.println(super.getBaseNames());
			throw new Exception("不好了!");
		}catch(Exception e) {
			lo.error(e);
		}
		
		ModelAndView mad = new ModelAndView();
		mad.setViewName("home");
		mad.addObject("msg", "登录成功！");
		mad.addObject("myUser",user);
		return mad;
	}
	
	
	 @RequestMapping("upload")
    public ModelAndView  upload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long  startTime=System.currentTimeMillis();
        System.out.println("fileName："+file.getOriginalFilename());
        String path="E:/"+new Date().getTime()+file.getOriginalFilename();
         
        File newFile=new File(path);
        //通过CommonsMultipartFile的方法直接写文件（注意这个时候）
        file.transferTo(newFile);
        long  endTime=System.currentTimeMillis();
        System.out.println("方法二的运行时间："+String.valueOf(endTime-startTime)+"ms");
        
        ModelAndView mad = new ModelAndView();
		mad.setViewName("home");
		return mad;
    }
}
