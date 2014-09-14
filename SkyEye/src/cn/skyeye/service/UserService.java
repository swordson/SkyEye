package cn.skyeye.service;

import cn.skyeye.enity.User;

public interface UserService {

	public User findBy(String username, String md5Password);



	public void update(User user);



	public User find(String userId);

}
