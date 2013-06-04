/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.methoden;

import java.util.HashSet;
import java.util.Set;

public class Unifier {

    public <E> Set<E> unify(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> s = new HashSet<E>();
        s.addAll(s1);
        s.addAll(s2);

        return s;
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1); s1.add(3);
        Set<Double> s2 = new HashSet<Double>();
        s2.add(10.0); s2.add(30.0);

        Set<Number> union = new Unifier().<Number>unify(s1, s2);
        System.out.println(union);
    }
}
