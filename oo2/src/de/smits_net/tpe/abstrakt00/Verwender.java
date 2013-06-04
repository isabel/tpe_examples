/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt00;

public class Verwender {

    public void main(String[] args) {
        Hund h = new Hund();
        füttern(h);

        Ente e = new Ente();
        füttern(e);
    }

    public void füttern(Tier t) {

        if (t instanceof Hund) {
            ((Hund) t).fressen();
        }
        else if (t instanceof Ente) {
            ((Ente) t).fressen();
        }
    }
}
