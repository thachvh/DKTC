package dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dktc.javatech.jhibernate.entity.LopHocPhongHoc;
import dktc.javatech.jhibernate.service.LopHocPhongHocService;



@RestController
public class LopHocPhongHocController {
@Autowired LopHocPhongHocService LopHocPhongHocService;
	
	@RequestMapping(value ="/getAllListLopHocPhongHoc", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<LopHocPhongHoc> List() {
		List<LopHocPhongHoc> list = LopHocPhongHocService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListLopHocPhongHoc/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<LopHocPhongHoc> getListLopHocPhongHoc(@PathVariable int first, @PathVariable int max) {
		List<LopHocPhongHoc> list = LopHocPhongHocService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getLopHocPhongHocById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public LopHocPhongHoc getLopHocPhongHocById(@PathVariable int id) {
		return LopHocPhongHocService.getById(id);
	}
	
	@RequestMapping(value ="/addLopHocPhongHoc", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addLopHocPhongHoc(@RequestBody LopHocPhongHoc cate) {
		LopHocPhongHocService.add(cate);
	}
	
	@RequestMapping(value = "/updateLopHocPhongHoc", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateLopHocPhongHoc(@RequestBody LopHocPhongHoc catemember) {
		LopHocPhongHocService.update(catemember);
	}

	@RequestMapping(value = "/deleteLopHocPhongHoc/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteLopHocPhongHoc(@PathVariable("id") int id) {
		LopHocPhongHocService.delete(id);	
	}
}
