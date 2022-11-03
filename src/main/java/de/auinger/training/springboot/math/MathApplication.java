package de.auinger.training.springboot.math;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MathApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathApplication.class, args);
    }

    @Bean
    public CommandLineRunner createDebugRunner() {
        return new DebugRunner();
    }

    // solution for bonus task -- note how we declare a bean dependency
    // as a method parameter
    @Bean
    public CommandLineRunner createParameterizedRunner(MathService mathService) {
        return new ParameterizedRunner(
                mathService,
                1,
                1,
                8
        );
    }

}
