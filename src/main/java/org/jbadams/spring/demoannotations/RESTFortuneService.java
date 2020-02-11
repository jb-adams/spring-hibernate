package org.jbadams.spring.demoannotations;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    public String getFortune() {
        return "a fortune from the REST service";
    }

}