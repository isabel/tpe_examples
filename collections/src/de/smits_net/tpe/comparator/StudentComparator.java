/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        if (o2.matrikelNummer == o1.matrikelNummer) {
            return 0;
        }
        else if (o2.matrikelNummer > o1.matrikelNummer) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
