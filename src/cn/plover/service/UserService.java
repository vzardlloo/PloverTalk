package cn.plover.service;

import cn.plover.dao.UserDao;
import cn.plover.dao.UserDaoImple;
import cn.plover.vo.User;

public class UserService {

	public User login(User user) {
		UserDao dao = new UserDaoImple();
		return dao.login(user);
	}
	
	
}
