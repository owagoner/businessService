package edu.cmu.odw.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Business;

public class BusinessServiceImpl implements BusinessServiceCustom{

	@Autowired
	BusinessService businessService;
	
	Random random = new Random();
	
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

	@Override
	public Iterable<Business> getRandomNBusinesses(int n) {		
		
        ArrayList<Business> allBusinesses = new ArrayList<Business>();
        ArrayList<Business> result = new ArrayList<Business>();
        
        for (Business b: this.businessService.findAll() ) {
        	allBusinesses.add(b);
        }
        
        for (int i = 0; i < n; i++) {
			Business b = allBusinesses.get(random.nextInt(allBusinesses.size()));
        	result.add(b);
        	allBusinesses.remove(b);
		}       
		
		return result;
	}

}