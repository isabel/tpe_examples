/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.nonstatic;

public class Computer {

    String hersteller = "HP";

    class Hauptspeicher {
        int groesse = 1024;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Hauptspeicher h1 = computer.new Hauptspeicher();
        Computer.Hauptspeicher h2 = computer.new Hauptspeicher();
    }
}


