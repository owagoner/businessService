package edu.cmu.odw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.odw.model.Business;
import edu.cmu.odw.service.BusinessService;



@RestController
public class BusinessController {

	@Autowired
	private BusinessService businessService;

	@RequestMapping(value = "/api/business/{id}")
	public Business business(@PathVariable("id") long id) {
		return businessService.findOne(id);
	}
	
	@RequestMapping(value = "/api/business/random/{id}")
	public Iterable<Business> businessRandomN(@PathVariable("id") int n) {
		return businessService.getRandomNBusinesses(n);
	}
	
	@RequestMapping(value = "/api/business/type/{id}")
	public Iterable<Business> businessType(@PathVariable("id") long id) {
		return businessService.findByBusinessTypeId(id);
	}
	
	@RequestMapping(value = "/api/business/byname")
	@ResponseBody
	public Iterable<Business> business(@RequestParam("name") String name) {
		
		return businessService.findByName(name);
	}
	
	@RequestMapping(value = "/api/business", method = RequestMethod.POST)
	public Business saveBusiness(@RequestBody Business business) {
		System.out.println(business);		
		
		return businessService.save(business);
	}
	
}