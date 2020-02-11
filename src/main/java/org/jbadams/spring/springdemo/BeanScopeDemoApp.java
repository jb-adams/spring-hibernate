package org.jbadams.spring.springdemo;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp implements Runnable {

    public void run(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("beanScope-context.xml");
        
        Coach alphaCoach = context.getBean("TrackCoach", Coach.class);
        Coach betaCoach = context.getBean("TrackCoach", Coach.class);

        // check if the object references are the same
        boolean result = (alphaCoach == betaCoach);
        System.out.println("Pointing to the same object? " + result);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);
        System.out.println("Memory location for betaCoach: " + betaCoach);

        context.close();
    }

}