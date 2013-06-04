/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.nonstatic;

public class Computer4 {

    String hersteller = "HP";

    class Hauptspeicher {

        int groesse = 1024;

        class Speicherzelle {

            int kapazitaet = 10;

            void doIt() {
                System.out.println(Computer4.this.hersteller);
                System.out.println(Hauptspeicher.this.groesse);
                System.out.println(kapazitaet);
            }
        }
    }
}

class X {
    public static void main(String[] args) {
        Computer4 computer = new Computer4();
        Computer4.Hauptspeicher speicher = computer.new Hauptspeicher();
        Computer4.Hauptspeicher.Speicherzelle zelle = speicher.new Speicherzelle();

        Computer4.Hauptspeicher.Speicherzelle z2 = new Computer4().new Hauptspeicher().new Speicherzelle();

    }
}
