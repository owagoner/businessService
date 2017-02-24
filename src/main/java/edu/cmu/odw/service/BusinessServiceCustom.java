package edu.cmu.odw.service;

import edu.cmu.odw.model.Business;

public interface BusinessServiceCustom{
    
	public Iterable<Business> findByName(String name);
	
	public Iterable<Business> findByBusinessTypeId(long businessTypeId);
}