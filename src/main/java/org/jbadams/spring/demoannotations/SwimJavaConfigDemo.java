package org.jbadams.spring.demoannotations;
import org.jbadams.spring.Runnable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo implements Runnable {

    public void run(String[] args) {

        /* Instead of the XML Config File, we use the Java Configuration Class
         * SportConfig is our Java Configuration Class
         */
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(SportConfig.class);
            
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        context.close();
    }

}
