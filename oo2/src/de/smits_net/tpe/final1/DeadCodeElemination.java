/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.final1;

public class DeadCodeElemination {

    public static final boolean SCHALTER = false;

    public static void main(String[] args) {
        if (SCHALTER) {
            System.out.println("Schalter AN");
        }
        else {
            System.out.println("Schalter AUS");
        }
    }
}

