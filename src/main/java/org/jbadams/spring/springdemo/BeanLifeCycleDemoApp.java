package org.jbadams.spring.springdemo;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp implements Runnable {

    public void run(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("beanLifeCycle-context.xml");
        
        Coach alphaCoach = context.getBean("TrackCoach", Coach.class);
        System.out.println(alphaCoach.getDailyWorkout());
        context.close();
    }

}