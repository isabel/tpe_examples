/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.hazards;

public class SerialNumberGenerator {

    private int serienNummer = 0;

    public int naechsteNummer() {

        int tmp = serienNummer;

        tmp = tmp + 1;

        serienNummer = tmp;

        return serienNummer;
    }
}
