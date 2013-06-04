/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.apiimpltrennung;

public class CalculatorImpl implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
