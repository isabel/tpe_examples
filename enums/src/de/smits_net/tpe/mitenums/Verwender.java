/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitenums;

public class Verwender {

    public static void main(String[] args) {
        DateJuggler dj = new DateJuggler();
        dj.setWochentag(Wochentag.FREITAG);
        // dj.setWochentag(Wochentag.FREITAG + 100);

        Wochentag wochentag = dj.getWochentag();
    }
}
