/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.erasure;

public class ShowErasure {

    public static void main(String[] args) {

        SimpleStack<String> s1 = new SimpleStack<String>(4);
        SimpleStack<Integer> s2 = new SimpleStack<Integer>(4);
        SimpleStack sRaw = new SimpleStack(4);

        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(sRaw.getClass());
    }
}
