/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.custom;

import java.io.IOException;

public class SimpleExample2 {

    public static void main(String[] args) {
        new SimpleExample2().method();
    }

    public void method() {
        try {
            System.out.println("A");
            thrower();
            System.out.println("B");
        }
        catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }


    private void thrower() throws IOException {
        throw new IOException("Festplatte explodiert");
    }
}
