package dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dktc.javatech.jhibernate.entity.PhongHoc;
import dktc.javatech.jhibernate.service.PhongHocService;

@RestController
public class PhongHocController {
@Autowired PhongHocService PhongHocService;
	
	@RequestMapping(value ="/getAllListPhongHoc", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<PhongHoc> List() {
		List<PhongHoc> list = PhongHocService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListPhongHoc/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<PhongHoc> getListPhongHoc(@PathVariable int first, @PathVariable int max) {
		List<PhongHoc> list = PhongHocService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getPhongHocById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public PhongHoc getPhongHocById(@PathVariable int id) {
		return PhongHocService.getById(id);
	}
	
	@RequestMapping(value ="/addPhongHoc", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addPhongHoc(@RequestBody PhongHoc cate) {
		PhongHocService.add(cate);
	}
	
	@RequestMapping(value = "/updatePhongHoc", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updatePhongHoc(@RequestBody PhongHoc catemember) {
		PhongHocService.update(catemember);
	}

	@RequestMapping(value = "/deletePhongHoc/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deletePhongHoc(@PathVariable("id") int id) {
		PhongHocService.delete(id);	
	}
}
