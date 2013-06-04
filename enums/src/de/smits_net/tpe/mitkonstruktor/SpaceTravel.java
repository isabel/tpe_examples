/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitkonstruktor;

public class SpaceTravel {

    private static final Planet HOME_PLANET = Planet.ERDE;

    public void travel(Planet zielPlanet) {

        if (zielPlanet == HOME_PLANET) {
            return; // wir sind doch schon da
        }

        switch (zielPlanet) {

            case JUPITER:
                // langer Flug
                break;

            case MARS:
                // kurzer Flug
                break;

            case MERKUR:
                // mittellanger Flug
                break;

            case NEPTUN:
                // ewiglanger Flug
                break;

            case SATURN:
                break;

            case URANUS:
                break;

            case VENUS:
                break;

             default:
                 throw new IllegalArgumentException("Unbekannter Wert" + zielPlanet);

        }
    }
}
