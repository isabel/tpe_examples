/*
 * (c) 2011 Thomas Smits
 */
package de.smits_net.tpe;

public class Kontrollstrukturen {

    public void doIt() {

        int count = getCount();   // Methode im Programm

        if (count < 0) {
          System.out.println("Fehler: Zahl ist negativ.");
        } else if (count > getMaxCount()) {
          System.out.println("Fehler: Zahl ist zu groß.");
        } else {
          System.out.println("Es kommen " + count + " Leute");
        }

        int mitarbeiterArt = 5;
        final int MANAGER = 1;
        final int SENIOR_DEVELOPER = 2;

        switch (mitarbeiterArt) {

            case MANAGER:
                addEinzelnesBuero();
                addFirmenwagen();
                addSekretaerin();
                break;

            case SENIOR_DEVELOPER:
                addEinzelnesBuero();
                addFirmenwagen();
                break;

            default:
                addGrossraumbuero();
        }

        // Kindersimulator
        for (int i = 0; i < 10; i++) {
            System.out.println("Sind wir schon da?");
            System.out.println("Ist es noch weit?");
        }

        System.out.println("Jetzt sind wir angekommen!");


        int i = 0;
        for (; i < 10; i++) {
            System.out.println("Variable außerhalb deklariert");
        }

        int j = 0;
        for (; j < 10;) {
            j++;
            System.out.println("Variable außerhalb deklariert");
        System.out.println("Inkrement innerhalb");
        }

        for (i = 0, j = 0; j < 10; i++, j++) { }


        int[] primzahlen = { 2, 3, 5, 7, 11, 13, 17, 19};
        int summe = 0;

        for (int primzahl : primzahlen) {
            summe += primzahl;
        }


//        for (int i = 0; i < primzahlen.length; i++) {
//            int primzahl = primzahlen[i];
//            summe += primzahl;
//        }

        for (;;) {
            System.out.println("Endlosschleife");
        }



    }

    public void doit2() {


        int i = 0;

        while (i < 10) {
            System.out.println("Sind wir schon da?");
            System.out.println("Ist es noch weit?");
            i++;
        }

        System.out.println("Jetzt sind wir angekommen!");
    }

    public void doit3() {

        int i = 0;

        do {
            System.out.println("Sind wir schon da?");
            System.out.println("Ist es noch weit?");
          i++;
        } while (i < 10);


        System.out.println("Jetzt sind wir angekommen!");

        do
          System.out.println("Hallo");
        while (true);
    }

    private void addGrossraumbuero() {
        // TODO Auto-generated method stub

    }

    private void addSekretaerin() {
        // TODO Auto-generated method stub

    }

    private void addFirmenwagen() {
        // TODO Auto-generated method stub

    }

    private void addEinzelnesBuero() {
        // TODO Auto-generated method stub

    }

    private void addEngine() {
        // TODO Auto-generated method stub

    }

    private void addWheels() {
        // TODO Auto-generated method stub

    }

    private void addRadio() {
        // TODO Auto-generated method stub

    }

    private void addAirConditioning() {
        // TODO Auto-generated method stub

    }

    int getCount() {
        return 5;
    }

    int getMaxCount() {
        return 5;
    }
}
