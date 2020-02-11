package org.jbadams.spring.demoannotations;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
        "Beware of the wolf in sheep's clothing",
        "Diligence is the mother of good luck",
        "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int i = myRandom.nextInt(data.length);
        return data[i];
    }

}