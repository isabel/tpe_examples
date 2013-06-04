/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundwildcard;

public class Verwender {

    public static void main(String[] args) {

        SimpleStack<Kreis> s1 = new SimpleStack<Kreis>(10);
        s1.push(new Kreis(0.4));
        s1.push(new Kreis(0.7));

        SimpleStack<Rechteck> s2 = new SimpleStack<Rechteck>(10);
        s2.push(new Rechteck(0.4, 0.4));
        s2.push(new Rechteck(0.7, 0.3));

        SimpleStack<Form> s3 = new SimpleStack<Form>(10);
        s3.push(new Rechteck(0.4, 0.4));
        s3.push(new Rechteck(0.7, 0.3));
        s3.push(new Kreis(0.4));
        s3.push(new Kreis(0.7));

        Berechner b = new Berechner();

        System.out.printf("Gesamtflaeche: %g%n", b.berechneFlaeche(s1));
        System.out.printf("Gesamtflaeche: %g%n", b.berechneFlaeche(s2));
        System.out.printf("Gesamtflaeche: %g%n", b.berechneFlaeche(s3));
    }
}
