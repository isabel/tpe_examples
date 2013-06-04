/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt0;

public class Verwender {

    public static void main(String[] args) {
        Hund h = new Hund();
        h.fortbewegen();

        Tier t = new Tier();

        Tier e = new Ente();
        e.fressen();
    }
}
