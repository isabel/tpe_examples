/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.anonymous;


public class AnonymBeispiel {

    public static void main(String[] args) {

        Object o = new Object() {
            public String toString() {
                return "Anonym...";
            }
        };

        System.out.println(o.toString());
    }
}
