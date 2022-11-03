package de.auinger.training.springboot.math.calculators;

import org.springframework.stereotype.Component;

@Component
public class SumCalculator {

    public int sum(int term1, int term2) {
        return term1 + term2;
    }

}
