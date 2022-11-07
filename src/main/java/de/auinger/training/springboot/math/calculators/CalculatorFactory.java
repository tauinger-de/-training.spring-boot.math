package de.auinger.training.springboot.math.calculators;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorFactory {

    @Bean
    public PowerOfCalculator createPowerOfCalculator() {
        return new PowerOfCalculator(true);
    }

}
