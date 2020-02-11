package org.jbadams.spring.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private final String[] possibilities = {
        "Crystal Clear",
        "A bit hazy, no one knows what will happen",
        "Dark Storm Clouds ahead"
    };

    public String getFortune() {

        Random random = new Random();
        int i = random.nextInt(possibilities.length);
        return possibilities[i];
    }

}