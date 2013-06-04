/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.apiimpltrennung;

public class Verwender {

    public static void main(String[] args) {

        Calculator calculator = CalculatorFactory.createCalculator();
        int ergebnis = calculator.add(1, 5);
        System.out.println(ergebnis);
    }
}
