package org.jbadams.spring.demoannotations;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice dribbles and 3-pointers";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}