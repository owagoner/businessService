package edu.cmu.odw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Business;
import edu.cmu.odw.service.BusinessService;


@Configuration
public class SeedData {

	@Autowired
    private BusinessService businessService;
    
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);

    @Bean
    public SeedData getBean() {        

        Business b1 = new Business("Business A", "www.businessa.com", "(345) 124-2345");
        Business b2 = new Business("Business B", "www.businessb.com", "(123) 344-8567");
        Business b3 = new Business("Business C", "www.businessc.com", "(344) 643-8652");
        Business b4 = new Business("Business D", "www.businessd.com", "(331) 452-5435");
        Business b5 = new Business("Business E", "www.businesse.com", "(344) 654-8542");
        
        businessService.save(b1);
        businessService.save(b2);
        businessService.save(b3);
        businessService.save(b4);
        businessService.save(b5);
        
        log.info("Business found with findAll():");
        log.info("-------------------------------");
        for (Business b : businessService.findAll()) {
            log.info(b.toString());
        }
        return new SeedData();
    }
}
