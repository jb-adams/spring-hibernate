package org.jbadams.spring.springdemo;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp implements Runnable {

    public void run(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext(
                "applicationContext.xml"
            );

        // retrieve bean from spring container
        String coachBeanId = args[1];
        Coach theCoach = context.getBean(coachBeanId, Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }

}