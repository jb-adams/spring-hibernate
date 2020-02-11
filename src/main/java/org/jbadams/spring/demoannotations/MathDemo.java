package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MathDemo implements Runnable {
    
    public void run(String[] args) {

        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MathConfig.class);

        MathCoach theCoach = context.getBean("mathCoach", MathCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}