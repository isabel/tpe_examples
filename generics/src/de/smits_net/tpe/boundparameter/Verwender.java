/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundparameter;

public class Verwender {

    public static void main(String[] args) {

        FormenStack<Kreis> s1 = new FormenStack<Kreis>(10);
        s1.push(new Kreis(0.4));
        s1.push(new Kreis(0.7));

        FormenStack<Rechteck> s2 = new FormenStack<Rechteck>(10);
        s2.push(new Rechteck(0.4, 0.4));
        s2.push(new Rechteck(0.7, 0.3));

        FormenStack<Form> s3 = new FormenStack<Form>(10);
        s3.push(new Rechteck(0.4, 0.4));
        s3.push(new Rechteck(0.7, 0.3));
        s3.push(new Kreis(0.4));
        s3.push(new Kreis(0.7));

        System.out.printf("Gesamtflaeche: %g%n", s1.flaeche());
        System.out.printf("Gesamtflaeche: %g%n", s2.flaeche());
        System.out.printf("Gesamtflaeche: %g%n", s3.flaeche());
    }
}
