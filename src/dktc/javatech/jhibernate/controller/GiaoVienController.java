package dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dktc.javatech.jhibernate.entity.GiaoVien;
import dktc.javatech.jhibernate.service.GiaoVienService;


@RestController
public class GiaoVienController {
	@Autowired GiaoVienService GiaoVienService;
	
	@RequestMapping(value ="/getAllListGiaoVien", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<GiaoVien> List() {
		List<GiaoVien> list = GiaoVienService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListGiaoVien/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<GiaoVien> getListGiaoVien(@PathVariable int first, @PathVariable int max) {
		List<GiaoVien> list = GiaoVienService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getGiaoVienById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public GiaoVien getGiaoVienById(@PathVariable int id) {
		return GiaoVienService.getById(id);
	}
	
	@RequestMapping(value ="/addGiaoVien", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addGiaoVien(@RequestBody GiaoVien cate) {
		GiaoVienService.add(cate);
	}
	
	@RequestMapping(value = "/updateGiaoVien", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateGiaoVien(@RequestBody GiaoVien catemember) {
		GiaoVienService.update(catemember);
	}

	@RequestMapping(value = "/deleteGiaoVien/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteGiaoVien(@PathVariable("id") int id) {
		GiaoVienService.delete(id);	
	}
}
