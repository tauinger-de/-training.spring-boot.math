package de.auinger.training.springboot.math;

import de.auinger.training.springboot.math.calculators.PowerOfCalculator;
import de.auinger.training.springboot.math.calculators.SumCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PowerOfCalculator powerOfCalculator() {
        // ausprogrammiert kann ich einfach ein Argument übergeben
        return new PowerOfCalculator(true);
    }

    @Bean
    public SumCalculator sumCalculator() {
        return new SumCalculator();
    }

    @Bean
    public MathService mathService(PowerOfCalculator powerOfCalculator, SumCalculator sumCalculator) {
        return new MathService(sumCalculator, powerOfCalculator);
    }

    @Bean
    public DebugRunner debugRunner(MathService mathService) {
        return new DebugRunner(mathService);
    }
}
