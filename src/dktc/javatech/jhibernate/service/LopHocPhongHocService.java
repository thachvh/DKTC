package dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dktc.javatech.jhibernate.dao.LopHocPhongHocDao;
import dktc.javatech.jhibernate.entity.LopHocPhongHoc;

@Service
public class LopHocPhongHocService {
@Autowired LopHocPhongHocDao LopHocPhongHocDao;
	
	@Transactional
	public List<LopHocPhongHoc> list()
	{
		return LopHocPhongHocDao.list();
	}
	
	@Transactional
	public List<LopHocPhongHoc> list(int first, int max)
	{
		return LopHocPhongHocDao.list(first,max);
	}
	
	@Transactional
	public LopHocPhongHoc getById(int id)
	{
		return LopHocPhongHocDao.getById(id);
	}
	
	@Transactional
	public void add(LopHocPhongHoc cate)
	{
		LopHocPhongHocDao.add(cate);
	}
	
	public void update(LopHocPhongHoc LopHocPhongHoc)
	{
		LopHocPhongHocDao.update(LopHocPhongHoc);
	}
	
	@Transactional
	public void delete(int id)
	{
		LopHocPhongHocDao.delete(id);
	}
}
