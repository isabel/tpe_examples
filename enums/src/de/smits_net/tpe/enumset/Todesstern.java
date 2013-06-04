/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enumset;

import java.util.EnumSet;

import static de.smits_net.tpe.enumset.Planet.*;

public class Todesstern {

    public void zerstoere(EnumSet<Planet> planeten) {
        for (Planet planet : planeten) {
            richteTodesstrahlAus(planet);
        }
    }

    public static void main(String[] args) {
        Todesstern ts = new Todesstern();
        ts.zerstoere(EnumSet.of(MARS, VENUS, JUPITER));
    }

    private void richteTodesstrahlAus(Planet planet) {
        // TODO Auto-generated method stub
    }
}
