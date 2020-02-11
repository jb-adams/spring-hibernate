package org.jbadams.spring;
import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String[] args) {

        String runnableId = args[0];

        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");
            Runnable runnable = context.getBean(runnableId, Runnable.class);
            runnable.run(args);

            context.close();



        /*
        switch(name) {
            case "CoachApp":
                CoachApp.run(args);
                break;
            case "HelloSpringApp":
                HelloSpringApp.run(args);
                break;
        }
        */
    }

}