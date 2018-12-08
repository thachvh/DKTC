package dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dktc.javatech.jhibernate.entity.SinhVienLopHoc;

@Component 
@Transactional
public class SinhVienLopHocDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<SinhVienLopHoc> list()
	{
		String hql="FROM SinhVienLopHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<SinhVienLopHoc> list(int first, int max)
	{
		String hql="FROM SinhVienLopHoc";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public SinhVienLopHoc getById(int id)
	{
		return (SinhVienLopHoc)sessionFactory.getCurrentSession().get(SinhVienLopHoc.class, id);
	}
	public void add(SinhVienLopHoc SinhVienLopHoc)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(SinhVienLopHoc);
	}
	
	public void update(SinhVienLopHoc SinhVienLopHoc) {
		sessionFactory.getCurrentSession().update(SinhVienLopHoc);
	}
	
	public void delete(int id)
	{
		SinhVienLopHoc SinhVienLopHoc=getById(id);
		sessionFactory.getCurrentSession().delete(SinhVienLopHoc);
	}
	
	public List<SinhVienLopHoc> getId(String s, int id)
	{
		String hql="FROM SinhVienLopHoc WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<SinhVienLopHoc>)query.list();
	}
}
