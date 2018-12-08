package src.dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.dktc.javatech.jhibernate.dao.SinhVienDao;
import src.dktc.javatech.jhibernate.entity.SinhVien;

@Service
public class SinhVienService {
@Autowired SinhVienDao SinhVienDao;
	
	@Transactional
	public List<SinhVien> list()
	{
		return SinhVienDao.list();
	}
	
	@Transactional
	public List<SinhVien> list(int first, int max)
	{
		return SinhVienDao.list(first,max);
	}
	
	@Transactional
	public SinhVien getById(int id)
	{
		return SinhVienDao.getById(id);
	}
	
	@Transactional
	public void add(SinhVien cate)
	{
		SinhVienDao.add(cate);
	}
	
	public void update(SinhVien SinhVien)
	{
		SinhVienDao.update(SinhVien);
	}
	
	@Transactional
	public void delete(int id)
	{
		SinhVienDao.delete(id);
	}
}
