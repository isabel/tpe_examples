/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enumset;

import java.util.EnumSet;

import static de.smits_net.tpe.enumset.Textauszeichnung.*;

public class Textverarbeitung {

    public void formatiere(String text, EnumSet<Textauszeichnung> formatierungen) {
        // ..
    }

    public static void main(String[] args) {
        Textverarbeitung tv = new Textverarbeitung();
        tv.formatiere("Hello World!", EnumSet.of(FETT, KURSIV));
    }
}
