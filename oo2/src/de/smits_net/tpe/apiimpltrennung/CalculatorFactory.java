/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.apiimpltrennung;

public class CalculatorFactory {

    private CalculatorFactory() {}

    public static Calculator createCalculator() {
        return new CalculatorImpl();
    }
}
