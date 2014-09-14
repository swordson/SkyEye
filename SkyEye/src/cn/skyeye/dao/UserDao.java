package cn.skyeye.dao;

import cn.skyeye.base.BaseDao;
import cn.skyeye.enity.User;

public interface UserDao{

	Object findByName(String username, String md5Password);

	void update(User user);

	User findById(String userId);


	

}
