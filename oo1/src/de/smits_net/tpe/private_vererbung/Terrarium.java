/* (c) 2013 Thomas Smits */
package de.smits_net.tpe.private_vererbung;

import java.lang.reflect.Field;

public class Terrarium {

    public static void main(String[] args) throws NoSuchFieldException,
    SecurityException, IllegalArgumentException, IllegalAccessException {
        Kampfechse k = new Kampfechse();
        Class ke = k.getClass();

        Field f = Rennechse.class.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println(f.get(k));
        k.guttenbergeisieren();
        System.out.println(f.get(k));

    }
}
