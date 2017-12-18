package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class ProcessMain {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	
        	List<Flights> flights1 = new ArrayList<Flights>();
        	flights1.add(new Flights("AV", 9854));
        	flights1.add(new Flights("AV", 1578));
        	flights1.add(new Flights("AV", 7985));
        	flights1.add(new Flights("AV", 1328));
        	flights1.add(new Flights("AV", 3848));
        	flights1.add(new Flights("AV", 7985));
        	   
        	GroupsOfFlights gof1 = new GroupsOfFlights();
        	gof1.setFlights(flights1);
        	gof1.setInternalGDSKey("asd1");
        	   
/**        	List<Flights> flights2 = new ArrayList<Flights>();
        	flights2.add(new Flights("AV", 4585));
        	flights2.add(new Flights("AV", 4585));
        	flights2.add(new Flights("AF", 4585));
        	flights2.add(new Flights("AV", 4585));
        	flights2.add(new Flights("AV", 4585));
        	flights2.add(new Flights("AV", 4585));

        	GroupsOfFlights gof2 = new GroupsOfFlights();
        	gof2.setFlights(flights2);
        	gof2.setInternalGDSKey("asd2");
        	       	**/
        	   
        	kSession.insert(gof1);
        	//kSession.insert(gof2);
            
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    

}
