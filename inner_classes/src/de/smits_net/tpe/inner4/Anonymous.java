/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner4;

import java.util.Date;

public class Anonymous {

    public static void main(String[] args) {

        final String welt = "Welt";

        A a = new A("Hallo") {

            Date date = new Date();

            {
                // Konstruktor der anonymen Klasse
                this.s = this.s.toUpperCase() + " "  + welt;
            }

            @Override
            public void methode() {
                System.out.println(this.s + " am " + date);
            }

        };

        a.methode();
    }
}

class A {
    String s;

    public A(String s) {
        this.s = s;
    }

    public void methode() {
        System.out.println(s);
    }
}