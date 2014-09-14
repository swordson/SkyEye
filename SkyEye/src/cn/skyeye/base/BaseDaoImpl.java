package cn.skyeye.base;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author jhon
 *
 */
public class BaseDaoImpl extends HibernateDaoSupport  implements BaseDao {

	

	@Override
	public List findList(String queryString, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAllObject(Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getObject(Class clazz, Serializable id) {
		
		return getHibernateTemplate().get(clazz, id);
	}

	@Override
	public void saveObject(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObject(Class clazz, Serializable id) {
		getHibernateTemplate().delete(getObject(clazz, id));
		
	}

	@Override
	public void removeObject(Object o) {
		getHibernateTemplate().delete(o);
		
	}

	@Override
	public void removeAllObject(Collection collection) {
		getHibernateTemplate().deleteAll(collection);
		
	}

	@Override
	public Object findBy(Class clazz, String name, Object value) {
		
		 Criteria cr=getCurrentSession().createCriteria(clazz);
	     cr.add(Restrictions.in(name, new Object[]{value}));   
	     Object obj = cr.list().get(0);
	     return obj; 
	}

	@Override
	public List findLike(Class clazz, String name, String value) {
		  Criteria cr = getCurrentSession().createCriteria(clazz);   
	      cr.add(Restrictions.like(name, "%"+value+"%"));  
	      return cr.list();   
	}

	@Override
	public List findAllBy(Class clazz, String name, Object value) {
		Criteria cr = getCurrentSession().createCriteria(clazz);   
        cr.add(Restrictions.in(name, new Object[]{value}));   
        List list = cr.list();    
        return list;   
	}

	@Override
	public void flush() {
		getHibernateTemplate().flush();
		
	}

	public Object find(String queryString, Object[] values) {
		
		return getHibernateTemplate().find(queryString, values);
	}
   public void update(Object object){
	   getHibernateTemplate().update(object);
   }

	public Session getCurrentSession(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession(); 
	}
	

}
