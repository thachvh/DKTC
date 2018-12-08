package src.dktc.javatech.jhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import src.dktc.javatech.jhibernate.dao.GiaoVienDao;
import src.dktc.javatech.jhibernate.entity.GiaoVien;



@Service
public class GiaoVienService {
@Autowired GiaoVienDao giaoVienDao;
	
	@Transactional
	public List<GiaoVien> list()
	{
		return giaoVienDao.list();
	}
	
	@Transactional
	public List<GiaoVien> list(int first, int max)
	{
		return giaoVienDao.list(first,max);
	}
	
	@Transactional
	public GiaoVien getById(int id)
	{
		return giaoVienDao.getById(id);
	}
	
	@Transactional
	public void add(GiaoVien cate)
	{
		giaoVienDao.add(cate);
	}
	
	public void update(GiaoVien giaoVien)
	{
		giaoVienDao.update(giaoVien);
	}
	
	@Transactional
	public void delete(int id)
	{
		giaoVienDao.delete(id);
	}
}
