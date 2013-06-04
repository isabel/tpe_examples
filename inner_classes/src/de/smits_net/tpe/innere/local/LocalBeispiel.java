/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.local;

public class LocalBeispiel {

    public static void main(String[] args) {

        class LocalClass {
            public String toString() {
                return "Ich bin lokal";
            }
        }

        LocalClass local = new LocalClass();
        System.out.println(local.toString());
    }
}
