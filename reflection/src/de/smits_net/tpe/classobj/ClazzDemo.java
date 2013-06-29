/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classobj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClazzDemo {

    public static void main(String[] args) {

        Class<Geschaeftsfuehrer> clazz = Geschaeftsfuehrer.class;

        System.out.println(clazz.getSuperclass()); // class de.smits_net.tpe.classobj.Manager
        System.out.println(clazz.getName()); // de.smits_net.tpe.classobj.Geschaeftsfuehrer
        System.out.println(clazz.isInterface()); // false
        System.out.println(clazz.getPackage()); // package de.smits_net.tpe.classobj
        System.out.println(clazz.isAssignableFrom(Mitarbeiter.class)); // false
        System.out.println(Mitarbeiter.class.isAssignableFrom(clazz)); // true
        System.out.println(clazz.isInstance(new Vorstand())); // false
        System.out.println(clazz.isInstance(new Geschaeftsfuehrer())); // true
        printArray(clazz.getFields()); // []
        printArray(clazz.getConstructors()); //  [public de.smits_net.tpe.classobj.Geschaeftsfuehrer()]
        printArray(clazz.getMethods()); // [public boolean java.lang.Object.equals(java.lang.Object),
                                        // public java.lang.String de.smits_net.tpe.classobj.Geschaeftsfuehrer.getDetails()
                                        // public final native void java.lang.Object.notify(),
                                        // ...

    }

    private static void printArray(Object[] array) {
        Set<Object> set = new HashSet<Object>();
        Collections.addAll(set, array);
        System.out.println(set);
    }
}
