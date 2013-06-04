/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.statisch1;

public class Ticket {

    public static int zaehler = 0;

    private int serienNummer;
    private String spiel;

    public Ticket(String spiel) {
        zaehler++;
        serienNummer = zaehler;
        this.spiel = spiel;
    }
}

