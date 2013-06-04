/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Methoden {

    public static void main(String[] args) throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        aufObjekt();
        aufKlasse();
    }

    public static void aufKlasse() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Class<?> clazz = Integer.class;
        Method m = clazz.getMethod("toHexString", int.class);
        String result = (String) m.invoke(null, 255);
        System.out.println(result); // -> ff
    }

    public static void aufObjekt() {

        String s = "Hello ";
        Class<?> clazz = s.getClass();

        try {
            Method m = clazz.getMethod("concat", String.class);
            Object result = m.invoke(s, "World!");
            System.out.println(result); // -> Hello World!
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Hello " + "World!");
    }
}
