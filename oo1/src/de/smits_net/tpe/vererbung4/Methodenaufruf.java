/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung4;

import java.util.Date;

public class Methodenaufruf {

    public void main() {

        {
            Mitarbeiter mi = new Mitarbeiter();
            Manager ma = new Manager();

            System.out.println(mi.getDetails());
            System.out.println(ma.getDetails());
        }

        {
            Mitarbeiter mi = new Manager();
            System.out.println(mi.getDetails());
        }

        {
            Mitarbeiter[] array = new Mitarbeiter[3];
            array[0] = new Mitarbeiter();
            array[1] = new Manager();
            array[2] = new Geschaeftsfuehrer();
        }

        {
            Manager ma = new Manager();
            Mitarbeiter mi = new Mitarbeiter();

            gehaltserhöhung(0.12, ma);
            gehaltserhöhung(0.02, mi);
        }

        {
//            Manager ma = new Mitarbeiter();
        }

        {
            Mitarbeiter mi = new Manager();

            Manager ma = (Manager) mi;
            ma.abteilung = "Buchhaltung";

            ((Manager) mi).abteilung = "Buchhaltung";
        }

        {
            Mitarbeiter mi = new Manager();
            if (mi instanceof Manager) {}
            if (mi instanceof Mitarbeiter) {}
            if (mi instanceof Geschaeftsfuehrer) {}
            if (null instanceof Mitarbeiter) {}

            Object o = new Manager();
            o = new String();

            Object[] os = new Object[2];
            os[0] = new Manager();
            os[1] = new Date();
        }

        Manager ma = new Manager();
        gehaltserhöhung(0.05d, ma);
    }

    public void gehaltserhöhung(double prozente, Mitarbeiter mi) {
        mi.gehalt *= 1.0 + prozente;
    }

    public void automatischeErhöhung(Mitarbeiter mi) {
        if (mi instanceof Geschaeftsfuehrer) {
            gehaltserhöhung(0.10, mi);
        }
        else if (mi instanceof Manager) {
            gehaltserhöhung(0.05, mi);
        }
        else {
            gehaltserhöhung(0.0003, mi);
        }
    }

    public void gehaltserhöhung(Geschaeftsfuehrer mi) {
        mi.gehalt = mi.gehalt * (1.0 + 0.2);
    }

    public void gehaltserhöhung(Manager mi) {
        mi.gehalt = mi.gehalt * (1.0 + 0.1);
    }

    public void gehaltserhöhung(Mitarbeiter mi) {
        mi.gehalt = mi.gehalt * (1.0 + 0.002);
    }

    public int average(int a1, int a2) { return 0; }
    public int average(int a1, int a2, int a3) { return 0; }
    public int average(int a1, int a2, int a3, int a4) { return 0; }

    public void automatischeErhöhung2(Mitarbeiter mi) {
        if (mi instanceof Geschaeftsfuehrer) {

            Geschaeftsfuehrer g = (Geschaeftsfuehrer) mi;

            if (g.prokura) {
                mi.gehalt = mi.gehalt * (1 + 0.2);
            }
            else {
                mi.gehalt = mi.gehalt * (1 + 0.1);
            }
        }
        else if (mi instanceof Manager) {
            mi.gehalt = mi.gehalt * (1 + 0.05);
        }
        else {
            mi.gehalt = mi.gehalt * (1 + 0.002);
        }
    }

    public void automatischeErhöhung3(Mitarbeiter mi) {

        if (mi.getClass() == Geschaeftsfuehrer.class) {

            Geschaeftsfuehrer g = (Geschaeftsfuehrer) mi;

            if (g.prokura) {
                mi.gehalt = mi.gehalt * (1 + 0.2);
            }
            else {
                mi.gehalt = mi.gehalt * (1 + 0.1);
            }
        }
        else if (mi.getClass() == Manager.class) {
            mi.gehalt = mi.gehalt * (1 + 0.05);
        }
        else {
            mi.gehalt = mi.gehalt * (1 + 0.002);
        }
    }
}
