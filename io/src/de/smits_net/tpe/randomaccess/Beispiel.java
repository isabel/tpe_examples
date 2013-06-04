/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.randomaccess;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Beispiel {

    static class Student {
        long matrikelNr;
        int note;

        public Student(long matrikelNr, int note) {
            super();
            this.matrikelNr = matrikelNr;
            this.note = note;
        }
    }

    public static void main(String[] args) throws IOException {

        List<Student> studenten = new ArrayList<Student>();
        studenten.add(new Student(100001L, 29));
        studenten.add(new Student(100002L, 30));
        studenten.add(new Student(100003L, 31));
        studenten.add(new Student(100004L, 24));
        studenten.add(new Student(100005L, 21));
        studenten.add(new Student(100006L, 17));
        studenten.add(new Student(100007L, 13));
        studenten.add(new Student(100008L, 12));
        studenten.add(new Student(100009L, 15));

        RandomAccessFile db = new RandomAccessFile("/tmp/datenbank", "rw");

        // Schreibe alle Matrikelnummern und Noten
        for (Student student : studenten) {
            db.writeLong(student.matrikelNr);
            db.writeInt(student.note);
        }

        long length = db.length();
        long datensatz = 0;
        int besteNote = Integer.MAX_VALUE;

        // Suche die beste Note
        while (datensatz + 8 < length) {
            db.seek(datensatz + 8);
            int note = db.readInt();
            besteNote = Math.min(note, besteNote);
            datensatz += 12;
        }

        db.close();

        System.out.println("Beste Note: " + (double) besteNote / 10);

    }
}
