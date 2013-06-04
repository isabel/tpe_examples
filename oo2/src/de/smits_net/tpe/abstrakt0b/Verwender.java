/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt0b;

public class Verwender {

    public void main(String[] args) {

        {
            Hund h = new Hund();
            h.fortbewegen();

            Tier t = new Tier();

            Tier e = new Ente();
            e.fressen();
        }

        {
            Hund h = new Hund();
            füttern(h);

            Ente e = new Ente();
            füttern(e);
        }

    }

    public void füttern(Tier t) {
        // Futter bereitstellen
        t.fressen();
    }
}
