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

        Business b1 = new Business("Great Clips", "www.greatclip.com", "(345) 124-2345", new Long(1));
        Business b2 = new Business("Hair Cutz", "www.haircutz.com", "(123) 344-8567", new Long(1));
        Business b3 = new Business("Salon On 5th", "www.salonon5.com", "(344) 643-8652", new Long(1));        
        Business b4 = new Business("Bob the Mechanic", "www.bobthemechanic.com", "(331) 892-6335", new Long(2));
        Business b5 = new Business("Baum Boulevard", "www.baumboulevardmechanic.com", "(344) 654-8842", new Long(2));
        Business b6 = new Business("Calfo's Auto Service", "www.calfoautoservice.com", "(344) 493-8922", new Long(2));
        Business b7 = new Business("Walter's Automotive", "www.walterauto.com", "(344) 814-8542", new Long(2));
        Business b8 = new Business("Wahl's Automotive", "www.wahlsauto.com", "(214) 634-8542", new Long(2));
        Business b9 = new Business("Jiffy Lube", "www.jiffylube.com", "(124) 168-8232", new Long(2));
        Business b10 = new Business("Sports Clips", "www.sportsclips.com", "(344) 933-1252", new Long(1));
        Business b11 = new Business("The Cut", "www.thecut.com", "(214) 123-2422", new Long(1));
        
        businessService.save(b1);
        businessService.save(b2);
        businessService.save(b3);
        businessService.save(b4);
        businessService.save(b5);
        businessService.save(b6);
        businessService.save(b7);
        businessService.save(b8);
        businessService.save(b9);
        businessService.save(b10);
        businessService.save(b11);
        
        log.info("Business found with findAll():");
        log.info("-------------------------------");
        for (Business b : businessService.findAll()) {
            log.info(b.toString());
        }
        return new SeedData();
    }
}
