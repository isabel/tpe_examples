/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.collections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Cache<E> {


    public static void main(String[] args) {

        ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();

        String key = "", value = "";

        if (!map.containsKey(key)) {
            map.put(key, value);
        }
        else {
            value = map.get(key);
        }

        value = map.putIfAbsent(key, value);
    }
}
