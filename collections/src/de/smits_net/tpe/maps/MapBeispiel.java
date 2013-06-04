/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBeispiel {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("go", "gehen");
        map.put("walk", "gehen");
        map.put("sleep", "schlafen");
        map.put("learn", "lernen");

        System.out.println(map); // --> {learn=lernen, sleep=schlafen, walk=gehen, go=gehen}

        System.out.println(map.get("go")); // --> gehen
        System.out.println(map.get("walk")); // --> gehen
        System.out.println(map.get("learn")); // --> lernen

        System.out.println(map.keySet()); // --> [learn, sleep, walk, go]
        System.out.println(map.values()); // --> [lernen, schlafen, gehen, gehen]

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.printf("%s engl. fuer %s%n", key, value);
        }


    }
}