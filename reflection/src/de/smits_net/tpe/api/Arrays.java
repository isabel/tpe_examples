/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.api;

import java.lang.reflect.Array;

public class Arrays {

    public static void main(String[] args) {

        Class<String> elementTyp = String.class;
        Object arrayInstanz = Array.newInstance(elementTyp, 4);
        Array.set(arrayInstanz, 0, "Erster Eintrag");
        Array.set(arrayInstanz, 1, "Zweiter Eintrag");
        Array.set(arrayInstanz, 2, "Dritter Eintrag");
        Array.set(arrayInstanz, 3, "Vierter Eintrag");

        int length = Array.getLength(arrayInstanz);

        for (int i = 0; i < length; i++) {
            Object element = Array.get(arrayInstanz, i);
            System.out.println(element);
        }
    }
}
