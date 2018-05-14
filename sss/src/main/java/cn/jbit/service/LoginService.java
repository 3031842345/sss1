package cn.jbit.service;

import cn.jbit.entity.Users;

public interface LoginService {
	
	public Users Login(String name,String pass);

}
