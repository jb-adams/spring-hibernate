package org.jbadams.spring.springdemo;
import org.jbadams.spring.Runnable;

public class CoachApp implements Runnable {
    public void run(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}