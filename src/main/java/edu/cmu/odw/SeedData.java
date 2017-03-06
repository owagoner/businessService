package edu.cmu.odw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Business;
import edu.cmu.odw.service.BusinessService;


@Configuration
public class SeedData {

	@Autowired
    private BusinessService businessService;

    @Bean
    public SeedData getBean() {    	      
    	
        Business b1 = new Business("Great Clips", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: 9:00am - 6:00pm","www.greatclip.com", "(345) 124-2345", new Long(1),"Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.","GreatClips");
        Business b2 = new Business("Hair Cutz", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: Closed", "www.haircutz.com", "(123) 344-8567", new Long(1),"Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci.","GreatClips");
        Business b3 = new Business("Salon On 5th", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: Closed", "www.salonon5.com", "(344) 643-8652", new Long(2),"Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.","TakaHairSalon");        
        Business b4 = new Business("Bob the Mechanic", "Mon: 9:00am - 5:00pm,Tue: 9:00am - 5:00pm,Wed: 9:00am - 5:00pm,Thu: 9:00am - 5:00pm,Fri: 9:00am - 5:00pm,Sat: Closed,Sun: Closed", "www.bobthemechanic.com", "(331) 892-6335", new Long(3),"Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula.","jiffylube");
        Business b5 = new Business("Baum Boulevard Oil", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: Closed", "www.baumboulevardmechanic.com", "(344) 654-8842", new Long(4),"Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat. In congue.","jiffylube");
        Business b6 = new Business("Calfo's Auto Service", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 4:00pm,Sun: Closed", "www.calfoautoservice.com", "(344) 493-8922", new Long(3),"Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum.","jiffylube");
        Business b7 = new Business("Walter's Automotive", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: Closed", "www.walterauto.com", "(344) 814-8542", new Long(3),"Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus.","jiffylube");
        Business b8 = new Business("Wahl's Automotive", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 4:00pm,Sun: Closed", "www.wahlsauto.com", "(214) 634-8542", new Long(3),"Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim.","jiffylube");
        Business b9 = new Business("Jiffy Lube", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: 9:00am - 6:00pm", "www.jiffylube.com", "(124) 168-8232", new Long(4),"Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis.","jiffylube");
        Business b10 = new Business("Sports Clips", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: 10:00am - 5:00pm,Sun: 10:00am - 5:00pm", "www.sportsclips.com", "(344) 933-1252", new Long(1),"Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede. Morbi porttitor lorem id ligula.","GreatClips");
        Business b11 = new Business("The Cut", "Mon: 9:00am - 6:00pm,Tue: 9:00am - 6:00pm,Wed: 9:00am - 6:00pm,Thu: 9:00am - 6:00pm,Fri: 9:00am - 5:00pm,Sat: Closed,Sun: Closed", "www.thecut.com", "(214) 123-2422", new Long(2),"Donec odio justo, sollicitudin ut, suscipit a, feugiat et, eros. Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue. Aliquam erat volutpat.","NoHoHairSalon");
        
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
       
        return new SeedData();
    }
}
