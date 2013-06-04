/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundwildcard;

public class Kreis extends Form {

    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double flaeche() {
        return 2 * Math.PI * radius * radius;
    }
}
