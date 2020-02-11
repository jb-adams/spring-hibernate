package org.jbadams.spring.springdemo;

public class VolleyballCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public VolleyballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Give me 100 bumps, volleys, and serves";
    }

    @Override
    public String getDailyFortune() {
        return "Your volleyball fortune! " + fortuneService.getFortune();
    }
}