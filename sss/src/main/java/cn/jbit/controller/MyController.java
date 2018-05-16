package cn.jbit.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jbit.entity.Users;
import cn.jbit.service.LoginServiceImpl;

@Controller
@RequestMapping(value="/user")
public class MyController {
	
	@Resource
	private LoginServiceImpl loginService;
	
	@GetMapping(value="/log")
	public ModelAndView login(){		
		ModelAndView mv = null;
		mv = new ModelAndView("login");
		return mv;		
	}

	@RequestMapping(value="/login.html",method=RequestMethod.POST)
	public String login(Users user, Model model) {
		user = loginService.Login(user);
		if (user != null) {
			return "testSuccess";
		}
		return "fail";
	}
}
