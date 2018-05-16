package cn.jbit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jbit.dao.login.LoginDao;
import cn.jbit.entity.Users;

@Service(value="loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	@Override
	public Users Login(Users user) {
		return loginDao.Login(user);
	}

	
}
