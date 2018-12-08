package src.dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.dktc.javatech.jhibernate.entity.LopHocPhongHoc;

@Component 
@Transactional
public class LopHocPhongHocDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<LopHocPhongHoc> list()
	{
		String hql="FROM LopHocPhongHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<LopHocPhongHoc> list(int first, int max)
	{
		String hql="FROM LopHocPhongHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public LopHocPhongHoc getById(int id)
	{
		return (LopHocPhongHoc)sessionFactory.getCurrentSession().get(LopHocPhongHocDao.class, id);
	}
	public void add(LopHocPhongHoc LopHocPhongHoc)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(LopHocPhongHoc);
	}
	
	public void update(LopHocPhongHoc LopHocPhongHoc) {
		sessionFactory.getCurrentSession().update(LopHocPhongHoc);
	}
	
	public void delete(int id)
	{
		LopHocPhongHoc LopHocPhongHoc=getById(id);
		sessionFactory.getCurrentSession().delete(LopHocPhongHoc);
	}
	
	public List<LopHocPhongHoc> getId(String s, int id)
	{
		String hql="FROM LopHocPhongHoc WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<LopHocPhongHoc>)query.list();
	}

}
