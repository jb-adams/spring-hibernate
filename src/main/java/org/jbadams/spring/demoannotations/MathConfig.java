package org.jbadams.spring.demoannotations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MathConfig {

    @Bean
    public FortuneService terribleFortuneService() {
        return new TerribleFortuneService();
    }

    @Bean
    public Coach mathCoach() {
        return new MathCoach(terribleFortuneService());
    }
}