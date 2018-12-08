package src.dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.dktc.javatech.jhibernate.entity.PhongHoc;

@Component 
@Transactional
public class PhongHocDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<PhongHoc> list()
	{
		String hql="FROM PhongHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<PhongHoc> list(int first, int max)
	{
		String hql="FROM PhongHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public PhongHoc getById(int id)
	{
		return (PhongHoc)sessionFactory.getCurrentSession().get(PhongHoc.class, id);
	}
	public void add(PhongHoc PhongHoc)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(PhongHoc);
	}
	
	public void update(PhongHoc PhongHoc) {
		sessionFactory.getCurrentSession().update(PhongHoc);
	}
	
	public void delete(int id)
	{
		PhongHoc PhongHoc=getById(id);
		sessionFactory.getCurrentSession().delete(PhongHoc);
	}
	
	public List<PhongHoc> getId(String s, int id)
	{
		String hql="FROM PhongHoc WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<PhongHoc>)query.list();
	}
}
