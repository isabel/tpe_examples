/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classobj;

public class Basics {

    public static void main(String[] args) throws ClassNotFoundException {

        {
            Class<String> clazz = String.class;
        }
        {
            Class<?> clazz = Class.forName("java.lang.String");
        }
        {
            Class<?> clazz = "Hello World".getClass();
            Class<?> a = int.class;
        }
        {
            Class<Integer> clazz = Integer.TYPE;
            System.out.println(void.class.toString());
        }
        {
            ClassLoader cl = ClassLoader.getSystemClassLoader();
            Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("java.lang.String");
        }
    }
}
