package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo implements Runnable {

    public void run(String[] args) {
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext(
                "springDemoAnnotationsContext.xml");

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
        Coach betaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same underlying object
        boolean result = alphaCoach == betaCoach;
        System.out.println("Pointing to the same object? " + result);
        System.out.println("Memory location for alphaCoach " + alphaCoach);
        System.out.println("Memory location for betaCoach " + betaCoach);

        context.close();
    }
}