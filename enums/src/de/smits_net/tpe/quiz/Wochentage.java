/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public enum Wochentage {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG,
    SAMSTAG, SONNTAG(false);

    private final boolean werktag;

    private Wochentage() {
        werktag = true;
    }

    private Wochentage(boolean werktag) {
        this.werktag = werktag;
    }
}
