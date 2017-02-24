package edu.cmu.odw.service;

import org.springframework.data.repository.CrudRepository;
import edu.cmu.odw.model.Business;


public interface BusinessService extends CrudRepository<Business, Long> , BusinessServiceCustom{	
}