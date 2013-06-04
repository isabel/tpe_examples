/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.final1;

public class NoDeadCodeElemination {

    public static boolean schalter = false;

    public static void main(String[] args) {
        if (schalter) {
            System.out.println("Schalter AN");
        }
        else {
            System.out.println("Schalter AUS");
        }
    }
}

