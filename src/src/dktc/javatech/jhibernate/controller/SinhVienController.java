package src.dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import src.dktc.javatech.jhibernate.entity.SinhVien;
import src.dktc.javatech.jhibernate.service.SinhVienService;

@RestController
public class SinhVienController {
@Autowired SinhVienService SinhVienService;
	
	@RequestMapping(value ="/getAllListSinhVien", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<SinhVien> List() {
		List<SinhVien> list = SinhVienService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListSinhVien/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<SinhVien> getListSinhVien(@PathVariable int first, @PathVariable int max) {
		List<SinhVien> list = SinhVienService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getSinhVienById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public SinhVien getSinhVienById(@PathVariable int id) {
		return SinhVienService.getById(id);
	}
	
	@RequestMapping(value ="/addSinhVien", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addSinhVien(@RequestBody SinhVien cate) {
		SinhVienService.add(cate);
	}
	
	@RequestMapping(value = "/updateSinhVien", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateSinhVien(@RequestBody SinhVien catemember) {
		SinhVienService.update(catemember);
	}

	@RequestMapping(value = "/deleteSinhVien/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteSinhVien(@PathVariable("id") int id) {
		SinhVienService.delete(id);	
	}
}
