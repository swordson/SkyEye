package cn.skyeye.dao.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Repository;

import cn.skyeye.base.BaseDaoImpl;
import cn.skyeye.dao.UserDao;
import cn.skyeye.enity.User;
@Repository(value="userDao")
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	@Override
	public Object findByName(String username, String md5Password) {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from User where username=? and  password=?").setParameter(0, username)
				.setParameter(1, md5Password).uniqueResult();
	}


	public void update(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(user);
		
	}


	@Override
	public User findById(String userId) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(User.class, userId);
	}


	

	

}
