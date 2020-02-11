package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo implements Runnable {

    public void run(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext(
                "springDemoAnnotationsContext.xml");

        // get the bean from spring container

        // this uses the manually specified beanId 
        // Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        // this uses the default beanId
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call daily workout method
        System.out.println(theCoach.getDailyWorkout());

        // call daily fortune method
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }

}