/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe;

/**
 * Klasse dient als Beispiel für den Coding-Standard und die Namenskonventionen
 * bei Java-Programmen.
 *
 * @author Thomas Smits
 */
public class CodingStandard {

    /**
     * Konstante, die dem Rest der Welt etwas mitteilen soll.
     */
    public static final int KONSTANTE_MIT_TOLLEM_WERT = 3;

    private int erstesFeld;
    private double zweitesFeld;

    /**
     * Methode, die etwas tut - oder auch nicht ;-).
     *
     * @param parameter Eingabewert für die Methode
     * @return gibt immer 42 zurück
     */
    public int methodeDieWasTut(int parameter) {

        if (parameter > 3) {
            erstesFeld = 12;
        }
        else {
            zweitesFeld = 13;
        }

        return 42;
    }
}
