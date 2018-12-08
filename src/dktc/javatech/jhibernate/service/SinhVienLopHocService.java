package dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dktc.javatech.jhibernate.dao.SinhVienLopHocDao;
import dktc.javatech.jhibernate.entity.SinhVienLopHoc;

@Service
public class SinhVienLopHocService {
@Autowired SinhVienLopHocDao SinhVienLopHocDao;
	
	@Transactional
	public List<SinhVienLopHoc> list()
	{
		return SinhVienLopHocDao.list();
	}
	
	@Transactional
	public List<SinhVienLopHoc> list(int first, int max)
	{
		return SinhVienLopHocDao.list(first,max);
	}
	
	@Transactional
	public SinhVienLopHoc getById(int id)
	{
		return SinhVienLopHocDao.getById(id);
	}
	
	@Transactional
	public void add(SinhVienLopHoc cate)
	{
		SinhVienLopHocDao.add(cate);
	}
	
	public void update(SinhVienLopHoc LopHoc)
	{
		SinhVienLopHocDao.update(LopHoc);
	}
	
	@Transactional
	public void delete(int id)
	{
		SinhVienLopHocDao.delete(id);
	}
}
