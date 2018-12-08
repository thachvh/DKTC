package dktc.javatech.jhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dktc.javatech.jhibernate.entity.Mon;
import dktc.javatech.jhibernate.service.MonService;

@RestController
public class MonController {
@Autowired MonService MonService;
	
	@RequestMapping(value ="/getAllListMon", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Mon> List() {
		List<Mon> list = MonService.list();
		return list;
	}
	
	
	@RequestMapping(value ="/getListMon/first={first}&max={max}", method = RequestMethod.GET, headers ="Accept=application/json")
	public List<Mon> getListMon(@PathVariable int first, @PathVariable int max) {
		List<Mon> list = MonService.list(first, max);
		return list;
	}
	
	@RequestMapping(value = "/getMonById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Mon getMonById(@PathVariable int id) {
		return MonService.getById(id);
	}
	
	@RequestMapping(value ="/addMon", method = RequestMethod.POST, headers ="Accept=application/json")
	public void addMon(@RequestBody Mon cate) {
		MonService.add(cate);
	}
	
	@RequestMapping(value = "/updateMon", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateMon(@RequestBody Mon catemember) {
		MonService.update(catemember);
	}

	@RequestMapping(value = "/deleteMon/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteMon(@PathVariable("id") int id) {
		MonService.delete(id);	
	}
}
