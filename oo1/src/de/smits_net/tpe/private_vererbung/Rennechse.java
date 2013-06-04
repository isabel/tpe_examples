/* (c) 2013 Thomas Smits */
package de.smits_net.tpe.private_vererbung;

public class Rennechse {

    private String name;

    public Rennechse(String name) {
        this.name = name;
    }

    private void adeln() {
        name = "von " + name;
    }

    public String getName() {
        return name;
    }

    public void guttenbergeisieren() {
        adeln();
    }
}
