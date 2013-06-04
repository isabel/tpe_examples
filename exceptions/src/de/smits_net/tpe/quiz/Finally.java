/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Finally {

    public static boolean f() {
        try {
            return true;
        }
        finally {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}
