/*
 * (c) 2009 Thomas Smits 
 */
package de.smits_net.tpe.apiimpltrennung;

import de.smits_net.tpe.apiimpltrennung.api.Calculator;
import de.smits_net.tpe.apiimpltrennung.api.CalculatorFactory;

public class Verwender {
    
    public static void main(String[] args) {
        
        Calculator calculator = CalculatorFactory.createCalculator();
        int ergebnis = calculator.add(1, 5);
        System.out.println(ergebnis);
    }
}
