package org.jbadams.spring.demoannotations;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    public String getFortune() {
        return "a database fortune!";
    }

}