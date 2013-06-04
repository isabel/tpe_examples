/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.anonymous;

public class Escape {

    public static Object escape() {

        return new Object() {
            public String toString() {
                return "Ich bin geflohen";
            }
        };
    }

    public static void main(String[] args) {
        Object o = Escape.escape();
        System.out.println(o.toString());
    }
}
