package org.jbadams.spring.activities;
import org.jbadams.spring.Runnable;
import org.jbadams.spring.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity3 implements Runnable {

    public void run(String[] args) {
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("activity3-context.xml");
            Coach coachA = context.getBean("VolleyballCoach", Coach.class);
            Coach coachB = context.getBean("VolleyballCoach", Coach.class);
            Coach coachC = context.getBean("VolleyballCoach", Coach.class);
            System.out.println("Memory address of coachA: " + coachA);
            System.out.println("Memory address of coachB: " + coachB);
            System.out.println("Memory address of coachC: " + coachC);
            context.close();
    }


}