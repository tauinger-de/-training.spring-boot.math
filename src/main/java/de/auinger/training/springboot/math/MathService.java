package de.auinger.training.springboot.math;

import de.auinger.training.springboot.math.calculators.PowerOfCalculator;
import de.auinger.training.springboot.math.calculators.SumCalculator;
import org.springframework.stereotype.Service;

public class MathService {

    private final SumCalculator sumCalculator;

    private final PowerOfCalculator powerOfCalculator;

    public MathService(SumCalculator sumCalculator, PowerOfCalculator powerOfCalculator) {
        this.sumCalculator = sumCalculator;
        this.powerOfCalculator = powerOfCalculator;
    }

    public int calculateTwoPlusThreeToThePowerOfFour() {
        return powerOfCalculator.powerOf(
                sumCalculator.sum(2, 3),
                4
        );
    }

    public int calculateSumAndPower(int term1, int term2, int power) {
        return powerOfCalculator.powerOf(
                sumCalculator.sum(term1, term2),
                power
        );
    }

}
