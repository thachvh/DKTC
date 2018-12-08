package src.dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import src.dktc.javatech.jhibernate.entity.LopHoc;

@Component 
@Transactional
public class LopHocDao {
private SessionFactory sessionFactory;
	
	public List<LopHoc> list()
	{
		String hql="FROM LopHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<LopHoc> list(int first, int max)
	{
		String hql="FROM LopHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public LopHoc getById(int id)
	{
		return (LopHoc)sessionFactory.getCurrentSession().get(LopHoc.class, id);
	}
	public void add(LopHoc LopHoc)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(LopHoc);
	}
	
	public void update(LopHoc LopHoc) {
		sessionFactory.getCurrentSession().update(LopHoc);
	}
	
	public void delete(int id)
	{
		LopHoc LopHoc=getById(id);
		sessionFactory.getCurrentSession().delete(LopHoc);
	}
	
	public List<LopHoc> getId(String s, int id)
	{
		String hql="FROM LopHoc WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<LopHoc>)query.list();
	}
}
