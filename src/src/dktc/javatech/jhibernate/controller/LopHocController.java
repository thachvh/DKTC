package src.dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import src.dktc.javatech.jhibernate.service.LopHocService;
import src.dktc.javatech.jhibernate.entity.LopHoc;

@RestController
public class LopHocController {
@Autowired LopHocService LopHocService;
	
	@RequestMapping(value ="/getAllListLopHoc", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<LopHoc> List() {
		List<LopHoc> list = LopHocService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListLopHoc/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<LopHoc> getListLopHoc(@PathVariable int first, @PathVariable int max) {
		List<LopHoc> list = LopHocService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getLopHocById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public LopHoc getLopHocById(@PathVariable int id) {
		return LopHocService.getById(id);
	}
	
	@RequestMapping(value ="/addLopHoc", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addLopHoc(@RequestBody LopHoc cate) {
		LopHocService.add(cate);
	}
	
	@RequestMapping(value = "/updateLopHoc", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateLopHoc(@RequestBody LopHoc catemember) {
		LopHocService.update(catemember);
	}

	@RequestMapping(value = "/deleteLopHoc/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteLopHoc(@PathVariable("id") int id) {
		LopHocService.delete(id);	
	}
}
