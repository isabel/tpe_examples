/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.clone;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mitarbeiter m1 = new Mitarbeiter("Heinz", 5000.00, null);
        Mitarbeiter m2 = (Mitarbeiter) m1.clone();

        System.out.println(m1 == m2);
        System.out.println(m2.name);
        System.out.println(m2.gehalt);
    }
}
