/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentDemo {

    public static void main(String[] args) {

        Set<Student> studenten = new TreeSet<Student>(new StudentComparator());

        studenten.add(new Student(4411, "Franz Müller"));
        studenten.add(new Student(5711, "Albert Meier"));
        studenten.add(new Student(4711, "Xaver Meier"));

        for (Student student : studenten) {
            System.out.println(student);
        }
    }
}
