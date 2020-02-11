package org.jbadams.spring.demoannotations;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

    @Value("${fileFortune.path}")
    private String filePath;
    // @Value("${fileFortune.count}")
    // private int fortuneCount;
    private ArrayList<String> data = new ArrayList<String>();

    // @Value("${fileFortune.fortunes}") // Value Dependency Injection
    // private String[] data;

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // int i = myRandom.nextInt(data.length);
        // return data[i];
        int i = myRandom.nextInt(data.size());
        return data.get(i);
    }

    @PostConstruct
    private void readIntoData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate input file");
        } catch (IOException e) {
            System.out.println("Input-Output Exception");
        }
                

    }

}