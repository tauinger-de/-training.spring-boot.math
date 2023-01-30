package de.auinger.training.springboot.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MathApplication {

    public static void main(String[] args) {
        System.out.println("Los geht's!");
        ApplicationContext context = SpringApplication.run(MathApplication.class, args);

        MathService mathService = context.getBean(MathService.class);
        mathService.calculateTwoPlusThreeToThePowerOfFour();

        DebugRunner debugRunner = context.getBean(DebugRunner.class);
        debugRunner.run();
    }

}
