package de.auinger.training.springboot.math;

import org.springframework.boot.CommandLineRunner;

public class ParameterizedRunner implements CommandLineRunner {

    private final MathService mathService;
    private final int term1;
    private final int term2;
    private final int power;

    public ParameterizedRunner(MathService mathService,
                               int term1, int term2, int power) {
        this.mathService = mathService;
        this.term1 = term1;
        this.term2 = term2;
        this.power = power;
    }

    @Override
    public void run(String... args) {
        int result = mathService.calculateSumAndPower(
                this.term1, this.term2, this.power
        );
        var output = String.format("(%d + %d) ^ %d = %d", this.term1, this.term2,
                this.power, result);
        System.out.println(output);
    }

}
