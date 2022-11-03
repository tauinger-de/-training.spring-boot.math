package de.auinger.training.springboot.math.calculators;

import org.springframework.stereotype.Component;

@Component
public class PowerOfCalculator {

    public int powerOf(int exponent, int power) {
        return (int) Math.pow(exponent, power);
    }

}
