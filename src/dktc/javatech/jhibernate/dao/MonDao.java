package dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dktc.javatech.jhibernate.entity.Mon;

@Component 
@Transactional
public class MonDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Mon> list()
	{
		String hql="FROM Mon";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Mon> list(int first, int max)
	{
		String hql="FROM Mon";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Mon getById(int id)
	{
		return (Mon)sessionFactory.getCurrentSession().get(Mon.class, id);
	}
	public void add(Mon Mon)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(Mon);
	}
	
	public void update(Mon Mon) {
		sessionFactory.getCurrentSession().update(Mon);
	}
	
	public void delete(int id)
	{
		Mon Mon=getById(id);
		sessionFactory.getCurrentSession().delete(Mon);
	}
	
	public List<Mon> getId(String s, int id)
	{
		String hql="FROM Mon WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<Mon>)query.list();
	}

}
