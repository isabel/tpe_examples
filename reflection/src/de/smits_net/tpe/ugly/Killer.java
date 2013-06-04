/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ugly;

import java.lang.reflect.Field;

public class Killer {

    public static void main(String[] args) throws Exception {

        // Don't try this at home!!!
        String immutable = "immutable String";
        System.out.println(immutable);
        System.out.println(immutable.hashCode());
        Class<? extends String> clazz = immutable.getClass();
        Field valueField = clazz.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] chars = (char[]) valueField.get(immutable);
        chars[0] = ' ';
        chars[1] = ' ';
        System.out.println(immutable);
        System.out.println(immutable.hashCode());
    }
}
