package cn.jbit.servlet;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.jbit.entity.Users;
import cn.jbit.service.LoginServiceImpl;

@Controller
@Scope(value = "prototype")
@RequestMapping("/user")
public class MyServlet {
	
	@Resource
	private LoginServiceImpl loginService;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Users user, Model model) {
		user = loginService.Login(user.getUName(), user.getUPassword());
		if (user != null) {
			return "success";
		}
		return "fail";
	}

	public LoginServiceImpl getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginServiceImpl loginService) {
		this.loginService = loginService;
	}

}
