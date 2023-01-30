package de.auinger.training.springboot.math;

import org.springframework.boot.CommandLineRunner;

public class DebugRunner {

    private final MathService mathService;

    public DebugRunner(MathService mathService) {
        this.mathService = mathService;
    }

    public void run() {
        int result = mathService.calculateTwoPlusThreeToThePowerOfFour();
        System.out.println("(2 + 3) ^ 4 = " + result);
    }

}
