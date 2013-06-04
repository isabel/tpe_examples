/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.custom;

import java.io.IOException;

public class SimpleExamples {

    public static void main(String[] args) {

        boolean b = true;

        try {
            System.out.println("A");

            if (b) {
                throw new IOException("Festplatte abgebrannt");
            }

            System.out.println("B");
        }
        catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
