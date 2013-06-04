/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classic;

public class Verwender {

    public static void main(String[] args) {
        DateJuggler dj = new DateJuggler();
        dj.setWochentag(DateJuggler.FREITAG);
        dj.setWochentag(DateJuggler.FREITAG + 100);

        int wochentag = dj.getWochentag();
    }
}
