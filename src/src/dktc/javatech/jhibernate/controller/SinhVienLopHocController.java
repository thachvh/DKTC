package src.dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.dktc.javatech.jhibernate.entity.SinhVienLopHoc;
import src.dktc.javatech.jhibernate.service.SinhVienLopHocService;

@RestController
public class SinhVienLopHocController {
@Autowired SinhVienLopHocService SinhVienLopHocService;
	
	@RequestMapping(value ="/getAllListSinhVienLopHoc", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<SinhVienLopHoc> List() {
		List<SinhVienLopHoc> list = SinhVienLopHocService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListSinhVienLopHoc/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<SinhVienLopHoc> getListSinhVienLopHoc(@PathVariable int first, @PathVariable int max) {
		List<SinhVienLopHoc> list = SinhVienLopHocService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getSinhVienLopHocById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public SinhVienLopHoc getSinhVienLopHocById(@PathVariable int id) {
		return SinhVienLopHocService.getById(id);
	}
	
	@RequestMapping(value ="/addSinhVienLopHoc", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addSinhVienLopHoc(@RequestBody SinhVienLopHoc cate) {
		SinhVienLopHocService.add(cate);
	}
	
	@RequestMapping(value = "/updateSinhVienLopHoc", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateSinhVienLopHoc(@RequestBody SinhVienLopHoc catemember) {
		SinhVienLopHocService.update(catemember);
	}

	@RequestMapping(value = "/deleteSinhVienLopHoc/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteSinhVienLopHoc(@PathVariable("id") int id) {
		SinhVienLopHocService.delete(id);	
	}
}
