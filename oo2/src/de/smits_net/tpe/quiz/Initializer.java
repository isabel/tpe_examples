/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Initializer {

    static {
        initialize();
    }

    private static boolean initialized = false;

    private static void initialize() {
        initialized = true;
    }

    public static void main(String[] args) {
        System.out.println(initialized);
    }
}
