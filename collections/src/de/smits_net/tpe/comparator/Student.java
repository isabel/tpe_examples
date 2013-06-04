/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.comparator;

public class Student {

    int matrikelNummer;
    String name;

    public Student(int matrikelNummer, String name) {
        this.matrikelNummer = matrikelNummer;
        this.name = name;
    }

    public String toString() {
        return matrikelNummer + " - " + name;
    }
}
