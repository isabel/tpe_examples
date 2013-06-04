/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.nonstatic;

public class Computer3 {

    String hersteller = "HP";
    Hauptspeicher speicher = new Hauptspeicher();

    class Hauptspeicher {
        int groesse = 1024;

        void printHersteller() {
            System.out.println(Computer3.this.hersteller);
        }
    }
}


