package de.auinger.training.springboot.math.calculators;

// We cannot use @Component here to declare this as a bean, since the constructor requires the showLog parameter.
// Hence, we create a bean of this type in CalculatorFactory.
public class PowerOfCalculator {

    private final boolean showLog;

    public PowerOfCalculator(boolean showLog) {
        this.showLog = showLog;
    }

    public int powerOf(int exponent, int power) {
        if (showLog) {
            System.out.println("Calculating " + exponent + " ^ " + power);
        }
        return (int) Math.pow(exponent, power);
    }

}
