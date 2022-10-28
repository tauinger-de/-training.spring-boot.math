package de.auinger.training.springboot.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MathApplication {

    public static void main(String[] args) {
        System.out.println("Starting Spring Boot application. Hold tight...");
        SpringApplication.run(MathApplication.class, args);
    }

    @PostConstruct
    public void sayHello() {
        System.out.println("Application started -- hello everybody!");
    }
}
