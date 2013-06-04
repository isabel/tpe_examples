/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enumset.alt;

import static de.smits_net.tpe.enumset.alt.Auszeichnungen.*;

public class Textprogramm {

    public void setAuszeichnung(int auszeichnung) {
        if ((auszeichnung & BOLD) > 0) {
            System.out.println("Fett");
        }
        if ((auszeichnung & ITALIC) > 0) {
            System.out.println("Kursiv");
        }
        if ((auszeichnung & UNDERLINE) > 0) {
            System.out.println("Unterstrichen");
        }
        if ((auszeichnung & STRIKEOUT) > 0) {
            System.out.println("Durchgestrichen");
        }
        if ((auszeichnung & OUTLINED) > 0) {
            System.out.println("Umriss");
        }
    }

    public static void main(String[] args) {
        Textprogramm t = new Textprogramm();
        t.setAuszeichnung(BOLD | UNDERLINE | STRIKEOUT);
    }
}
