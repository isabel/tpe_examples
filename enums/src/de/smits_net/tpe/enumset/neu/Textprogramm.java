/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enumset.neu;

import static de.smits_net.tpe.enumset.neu.Auszeichnungen.*;

import java.util.EnumSet;

public class Textprogramm {

    public void setAuszeichnung(EnumSet<Auszeichnungen> auszeichnung) {

        if (auszeichnung.contains(BOLD)) {
            System.out.println("Fett");
        }
        if (auszeichnung.contains(ITALIC)) {
            System.out.println("Kursiv");
        }
        if (auszeichnung.contains(UNDERLINE)) {
            System.out.println("Unterstrichen");
        }
        if (auszeichnung.contains(STRIKEOUT)) {
            System.out.println("Durchgestrichen");
        }
        if (auszeichnung.contains(OUTLINED)) {
            System.out.println("Umriss");
        }
    }

    public static void main(String[] args) {
        Textprogramm t = new Textprogramm();
        t.setAuszeichnung(EnumSet.of(BOLD, UNDERLINE, STRIKEOUT));
    }
}
