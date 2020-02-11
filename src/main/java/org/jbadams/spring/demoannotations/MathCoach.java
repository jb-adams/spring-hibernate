package org.jbadams.spring.demoannotations;

public class MathCoach implements Coach {

    private FortuneService fortuneService;

    public MathCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Do 1000 differential equations and linear transformations";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}