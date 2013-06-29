/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ugly;

import java.lang.reflect.Field;
import java.net.Socket;
import java.net.URL;

public class Erdogan {

    public static void main(String[] args) throws Exception {

        // Don't try this at home!!!
        String immutable = "Erdogan ist böse";
        System.out.println(immutable);

        Class<? extends String> clazz = immutable.getClass();
        Field valueField = clazz.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] chars = (char[]) valueField.get(immutable);
        chars[12] = 'g';
        chars[13] = 'u';
        chars[14] = 't';
        chars[15] = '!';
        System.out.println(immutable);
        System.out.println("Ein anderer sagt:");
        System.out.println("Erdogan ist böse");
    }
}
