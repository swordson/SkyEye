package cn.skyeye.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.skyeye.dao.UserDao;
import cn.skyeye.enity.User;
import cn.skyeye.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;

	@Override
	public User findBy(String username, String md5Password) {
		// TODO Auto-generated method stub
		return (User) userDao.findByName(username,md5Password);
	}

	

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}



	@Override
	public User find(String userId) {
		// TODO Auto-generated method stub
		return userDao.findById(userId);
	}

  





		
	
	
	

}
