/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.nonstatic;

public class Computer2 {

    Hauptspeicher hauptspeicher = new Hauptspeicher();

    class Hauptspeicher {

        Speicherzelle zelle = new Speicherzelle();

        class Speicherzelle {

        }
    }
}
