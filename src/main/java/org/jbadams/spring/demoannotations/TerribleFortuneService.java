package org.jbadams.spring.demoannotations;

public class TerribleFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "You've met with a terrible fate, haven't you?";
    }

}