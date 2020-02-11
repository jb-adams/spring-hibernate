package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity4 implements Runnable {

    public void run(String[] args) {

        // load context
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext(
                "springDemoAnnotationsContext.xml");

        // get the bean
        Coach coach = context.getBean("basketballCoach", Coach.class);

        // output messages
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyWorkout());

        // close context
        context.close();
    }

}