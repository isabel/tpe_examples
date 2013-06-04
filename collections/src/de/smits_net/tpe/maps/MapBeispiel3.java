/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBeispiel3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("gehen", "go");
        map.put("gehen", "walk");
        map.put("schlafen", "sleep");
        map.put("lernen", "learn");

        System.out.println(map);

    }
}