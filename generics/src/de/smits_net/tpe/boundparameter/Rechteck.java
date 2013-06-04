/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundparameter;

public class Rechteck extends Form {

    private double a;
    private double b;

    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double flaeche() {
        return a * b;
    }
}
