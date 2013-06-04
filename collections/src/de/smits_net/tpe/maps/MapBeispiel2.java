/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.maps;

import java.util.HashMap;
import java.util.Map;

public class MapBeispiel2 {

    public static void main(String[] args) {

        Map<Personalnummer, Mitarbeiter> map = new HashMap<Personalnummer, Mitarbeiter>();

        Mitarbeiter meier = new Mitarbeiter("Meier", 1200.00);
        Mitarbeiter mueller =  new Mitarbeiter("Mueller", 2400.00);
        Mitarbeiter schulze = new Mitarbeiter("Schulze", 1200.00);

        map.put(new Personalnummer("4711"), meier);
        map.put(new Personalnummer("4242"), mueller);
        map.put(new Personalnummer("0007"), schulze);

        System.out.println(map.containsKey(new Personalnummer("0007"))); // --> true
        System.out.println(map.containsValue(meier)); // --> true
    }
}
