package org.jbadams.spring.demoannotations;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

// @Component("thatSillyCoach") // specify beanId without xml configuration
@Component // default beanId takes class name (ie. TennisCoach -> tennisCoach)
// @Scope("prototype") // use the Scope annotation to define Bean Scope
public class TennisCoach implements Coach {

    // AUTOMATIC DEPENDENCY INJECTION VIA FIELD
    // QUALIFIER TO SPECIFY THE BEAN ID
    // @Qualifier("fileFortuneService")
    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    /*
    // AUTOMATIC DEPENDENCY INJECTION VIA FIELD
    @Autowired
    private FortuneService fortuneService;
    */

    /*
    // AUTOMATIC DEPENDENCY INJECTION VIA CONSTRUCTOR
    // scans for the FortuneService and injects
    // I think this only works if there is one implementation of the interface
    // otherwise, how would it know which FortuneService to inject?
    @Autowired 
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    public TennisCoach() {}

    /*
    // AUTOMATIC DEPENDENCY INJECTION VIA SETTER METHOD
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // define my init method
    // BEAN LIFECYCLE -> INIT WITH ANNOTATIONS
    @PostConstruct
    public void startup() {
        System.out.println("TennisCoach: inside startup");
    }

    // define my destroy method
    // BEAN LIFECYCLE -> DESTROY WITH ANNOTATIONS
    @PreDestroy
    public void cleanup() {
        System.out.println("TennisCoach: inside cleanup");
    }
}