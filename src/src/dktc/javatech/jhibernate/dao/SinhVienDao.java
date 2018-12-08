package src.dktc.javatech.jhibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import src.dktc.javatech.jhibernate.entity.SinhVien;
@Component 
@Transactional
public class SinhVienDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<SinhVien> list()
	{
		String hql="FROM SinhVien";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<SinhVien> list(int first, int max)
	{
		String hql="FROM SinhVien";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public SinhVien getById(int id)
	{
		return (SinhVien)sessionFactory.getCurrentSession().get(SinhVien.class, id);
	}
	public void add(SinhVien SinhVien)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(SinhVien);
	}
	
	public void update(SinhVien SinhVien) {
		sessionFactory.getCurrentSession().update(SinhVien);
	}
	
	public void delete(int id)
	{
		SinhVien SinhVien=getById(id);
		sessionFactory.getCurrentSession().delete(SinhVien);
	}
	
	public List<SinhVien> getId(String s, int id)
	{
		String hql="FROM SinhVien WHERE "+s + " = "+id+"";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return (List<SinhVien>)query.list();
	}
}
