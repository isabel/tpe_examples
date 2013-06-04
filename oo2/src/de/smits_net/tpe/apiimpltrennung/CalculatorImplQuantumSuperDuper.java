/* (c) 2013 Thomas Smits */
package de.smits_net.tpe.apiimpltrennung;

public class CalculatorImplQuantumSuperDuper implements Calculator {

    @Override
    public int add(int a, int b) {
        Integer ai = a;
        Integer bi = b;
        Integer r = ai + bi;
        return r;
    }

    @Override
    public int sub(int a, int b) {
        Integer ai = a;
        Integer bi = b;
        Integer r = ai - bi;
        return r;
    }

}
