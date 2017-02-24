package edu.cmu.odw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Business;

public class BusinessServiceImpl implements BusinessServiceCustom{

	@Autowired
	BusinessService businessService;
	
	@Override
	public Iterable<Business> findByName(String name) {
        
		ArrayList<Business> result = new ArrayList<Business>();
		
	    Iterable<Business> businesses = businessService.findAll();	
		
		for(Business b: businesses){
			if(b.getName().toLowerCase().equals(name.toLowerCase())){
				result.add(b);
			}
		}
		
		return result;
	}

	@Override
	public Iterable<Business> findByBusinessTypeId(long businessTypeId) {
        
		ArrayList<Business> result = new ArrayList<Business>();
		
	    Iterable<Business> businesses = businessService.findAll();	
		
		for(Business b: businesses){
			if(b.getbusinessTypeId() == businessTypeId){
				result.add(b);
			}
		}
		return result;
	}

}