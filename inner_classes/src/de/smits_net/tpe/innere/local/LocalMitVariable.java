/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.local;

public class LocalMitVariable {

    public static void main(String[] args) {

        final String ausgabe = "Ich bin lokal";

        class LocalClass {
            public String toString() {
                return ausgabe;
            }
        }

        LocalClass local = new LocalClass();
        System.out.println(local);
    }
}
