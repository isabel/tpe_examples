/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Instanzen {

    public static void main(String[] args) {

        Class<Date> clazz = Date.class;

        try {
            Constructor<Date> constructor = clazz.getConstructor(long.class);
            Object o = constructor.newInstance(222222222222L);
            System.out.println(o); // -> Sun Jan 16 01:23:42 CET 1977
        }
        catch (SecurityException e) {
            // darf keine Reflection machen
        }
        catch (NoSuchMethodException e) {
            // es gibt den Construktor nicht
        }
        catch (IllegalArgumentException e) {
            // Argumente passen nicht
        }
        catch (InstantiationException e) {
            // Klasse ist abstrakt
        }
        catch (IllegalAccessException e) {
            // Konstruktor ist nicht public
        }
        catch (InvocationTargetException e) {
            // Konstruktor wirft selber eine Exception
        }

        System.out.println(new Date(222222222222L));
    }
}
