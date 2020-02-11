package org.jbadams.spring.demoannotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration // this is a Java Spring Configuration, done without any XML
// @ComponentScan("org.jbadams.spring.demoannotations") // component scanning without xml
@PropertySource("classpath:javaConfiguration.properties")
public class SportConfig {

    // define bean for our sad fortune service
    // the @Bean annotation creates a Bean with BeanId of method name,
    // interface of return type
    // use @Bean for pure Java code, no component scan required 
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}