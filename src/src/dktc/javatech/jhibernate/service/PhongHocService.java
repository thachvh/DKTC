package src.dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.dktc.javatech.jhibernate.dao.PhongHocDao;
import src.dktc.javatech.jhibernate.entity.PhongHoc;

@Service
public class PhongHocService {
@Autowired PhongHocDao PhongHocDao;
	
	@Transactional
	public List<PhongHoc> list()
	{
		return PhongHocDao.list();
	}
	
	@Transactional
	public List<PhongHoc> list(int first, int max)
	{
		return PhongHocDao.list(first,max);
	}
	
	@Transactional
	public PhongHoc getById(int id)
	{
		return PhongHocDao.getById(id);
	}
	
	@Transactional
	public void add(PhongHoc cate)
	{
		PhongHocDao.add(cate);
	}
	
	public void update(PhongHoc PhongHoc)
	{
		PhongHocDao.update(PhongHoc);
	}
	
	@Transactional
	public void delete(int id)
	{
		PhongHocDao.delete(id);
	}
}
