/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classobj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClazzDemo {

    public static void main(String[] args) {

        Class<Vorstand> clazz = Vorstand.class;

        System.out.println(clazz.getSuperclass()); // class de.smits_net.tpe.Mitarbeiter
        System.out.println(clazz.getName()); // de.smits_net.tpe.Vorstand
        System.out.println(clazz.isInterface()); // false
        System.out.println(clazz.getPackage()); // package de.smits_net.tpe
        System.out.println(clazz.isAssignableFrom(Mitarbeiter.class)); // false
        System.out.println(Mitarbeiter.class.isAssignableFrom(clazz)); // true
        System.out.println(clazz.isInstance(new Angestellter())); // false
        System.out.println(clazz.isInstance(new Vorstand())); // true
        printArray(clazz.getFields()); // []
        printArray(clazz.getConstructors()); // [public de.smits_net.tpe.Vorstand()]
        printArray(clazz.getMethods()); // [public boolean java.lang.Object.equals(java.lang.Object),
                                        // public final double de.smits_net.tpe.Mitarbeiter.bonus(),
                                        // public double de.smits_net.tpe.Vorstand.zielerreichung()
                                        // ...
    }

    private static void printArray(Object[] array) {
        Set<Object> set = new HashSet<Object>();
        Collections.addAll(set, array);
        System.out.println(set);
    }
}
