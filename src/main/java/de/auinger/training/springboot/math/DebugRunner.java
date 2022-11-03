package de.auinger.training.springboot.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DebugRunner implements CommandLineRunner {

    // of course, we could also use constructor injection here..
    @Autowired
    private MathService mathService;

    @Override
    public void run(String... args) {
        int result = mathService.calculateTwoPlusThreeToThePowerOfFour();
        System.out.println("(2 + 3) ^ 4 = " + result);
    }

}
