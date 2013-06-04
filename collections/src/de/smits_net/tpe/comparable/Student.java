/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.comparable;

public class Student implements Comparable<Student> {

    private int matrikelNummer;
    private String name;

    public Student(int matrikelNummer, String name) {
        this.matrikelNummer = matrikelNummer;
        this.name = name;
    }

    public int compareTo(Student o) {
        if (o.matrikelNummer == matrikelNummer) {
            return 0;
        }
        else if (o.matrikelNummer > matrikelNummer) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public String toString() {
        return matrikelNummer + " - " + name;
    }
}
