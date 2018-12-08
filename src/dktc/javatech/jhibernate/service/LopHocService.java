package dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dktc.javatech.jhibernate.dao.LopHocDao;
import dktc.javatech.jhibernate.entity.LopHoc;

@Service
public class LopHocService {
@Autowired LopHocDao LopHocDao;
	
	@Transactional
	public List<LopHoc> list()
	{
		return LopHocDao.list();
	}
	
	@Transactional
	public List<LopHoc> list(int first, int max)
	{
		return LopHocDao.list(first,max);
	}
	
	@Transactional
	public LopHoc getById(int id)
	{
		return LopHocDao.getById(id);
	}
	
	@Transactional
	public void add(LopHoc cate)
	{
		LopHocDao.add(cate);
	}
	
	public void update(LopHoc LopHoc)
	{
		LopHocDao.update(LopHoc);
	}
	
	@Transactional
	public void delete(int id)
	{
		LopHocDao.delete(id);
	}
}
