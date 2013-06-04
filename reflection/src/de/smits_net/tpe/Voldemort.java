/* (c) 2011 Thomas Smits */
package de.smits_net.tpe;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author Thomas Smits
 */
public class Voldemort {

    public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        String s = new String("Voldemort");
        Class<?> clazz = s.getClass();
        Field f = clazz.getDeclaredField("value");
        f.setAccessible(true);
        char[] zeichen = (char[]) f.get(s);
        zeichen[0] = 'M';
        zeichen[1] = 'u';
        zeichen[2] = 'f';
        zeichen[3] = 'l';
        System.out.println(s);

        System.out.println("Voldemort");

        Map<String, String> m = new HashMap<String, String>();
        m.put("Harry", "Potter");

        Field f2 = clazz.getDeclaredField("hash");
        f2.setAccessible(true);
        f2.set("Harry", 6);
        System.out.println(m.get("Harry"));
        System.out.println(m);


    }
}
