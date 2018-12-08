package src.dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.dktc.javatech.jhibernate.entity.GiaoVien;



@Component 
@Transactional
public class GiaoVienDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<GiaoVien> list()
	{
		String hql="FROM GiaoVien";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<GiaoVien> list(int first, int max)
	{
		String hql="FROM GiaoVien";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public GiaoVien getById(int id)
	{
		return (GiaoVien)sessionFactory.getCurrentSession().get(GiaoVien.class, id);
	}
	public void add(GiaoVien giaoVien)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(giaoVien);
	}
	
	public void update(GiaoVien giaoVien) {
		sessionFactory.getCurrentSession().update(giaoVien);
	}
	
	public void delete(int id)
	{
		GiaoVien giaoVien=getById(id);
		sessionFactory.getCurrentSession().delete(giaoVien);
	}
	
	public List<GiaoVien> getId(String s, int id)
	{
		String hql="FROM GiaoVien WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<GiaoVien>)query.list();
	}
}
