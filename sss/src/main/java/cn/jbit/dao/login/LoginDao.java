package cn.jbit.dao.login;

import cn.jbit.entity.Users;

public interface LoginDao {
	
	public Users Login(String name,String pass);

}
