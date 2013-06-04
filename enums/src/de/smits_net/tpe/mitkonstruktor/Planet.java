/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitkonstruktor;

public enum Planet {

    MERKUR  (59e+6,88),
    VENUS   (108e+6,225),
    ERDE    (150e+6, 365),
    MARS    (228e+6, 1.9*365),
    JUPITER (778e+6, 11.9*365),
    SATURN  (1427e+6, 29.5*365),
    URANUS  (2870e+6, 84*365),
    NEPTUN  (4497e+6, 165*365);

    private final double entfernungsonne; // in km
    private final double umlaufzeit;      // in tagen

     Planet(double entfernungsonne, double umlaufzeit) {
        this.entfernungsonne = entfernungsonne;
        this.umlaufzeit = umlaufzeit;
    }

    public double bahngeschwindigkeit() {
        return 2 * entfernungsonne * Math.PI / umlaufzeit / 24;
    }
}
