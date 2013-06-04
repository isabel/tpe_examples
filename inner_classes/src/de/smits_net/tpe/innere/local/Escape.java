/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.local;

public class Escape {

    public static Object escape() {

        class Papillon {
            public String toString() {
                return "Ich bin geflohen";
            }
        }

        return new Papillon();
    }

    public static void main(String[] args) {
        System.out.println(escape());
    }
}
