package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo implements Runnable {

    public void run(String[] args) {

        /* Instead of the XML Config File, we use the Java Configuration Class
         * SportConfig is our Java Configuration Class
         */
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SportConfig.class);
            
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        context.close();
    }

}