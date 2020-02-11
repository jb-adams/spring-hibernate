package org.jbadams.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(final String[] args) {

        final String runnableId = args[0];
        final ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("launcherContext.xml");
        final Runnable runnable = context.getBean(runnableId, Runnable.class);
            runnable.run(args);

            context.close();
    }

}