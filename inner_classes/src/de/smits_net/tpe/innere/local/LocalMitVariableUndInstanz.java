/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.local;

public class LocalMitVariableUndInstanz {

    private String variable = "Ich bin nicht lokal";

    public void doIt() {

        final String ausgabe = "Ich bin lokal";

        class LocalClass {
            public String toString() {
                return ausgabe + ", " + variable;
            }
        }

        LocalClass local = new LocalClass();
        System.out.println(local);
    }
}
