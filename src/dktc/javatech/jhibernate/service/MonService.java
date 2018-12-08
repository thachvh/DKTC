package dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dktc.javatech.jhibernate.dao.MonDao;
import dktc.javatech.jhibernate.entity.Mon;

@Service
public class MonService {
@Autowired MonDao MonDao;
	
	@Transactional
	public List<Mon> list()
	{
		return MonDao.list();
	}
	
	@Transactional
	public List<Mon> list(int first, int max)
	{
		return MonDao.list(first,max);
	}
	
	@Transactional
	public Mon getById(int id)
	{
		return MonDao.getById(id);
	}
	
	@Transactional
	public void add(Mon cate)
	{
		MonDao.add(cate);
	}
	
	public void update(Mon Mon)
	{
		MonDao.update(Mon);
	}
	
	@Transactional
	public void delete(int id)
	{
		MonDao.delete(id);
	}
}
