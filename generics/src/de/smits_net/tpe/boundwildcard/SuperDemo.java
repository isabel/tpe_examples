/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundwildcard;

import java.util.ArrayList;
import java.util.List;

public class SuperDemo {

    public static void main(String[] args) {
        SimpleStack<Form> s = new SimpleStack<Form>(10);
        s.push(new Rechteck(0.4, 0.4));
        s.push(new Rechteck(0.7, 0.3));
        s.push(new Kreis(0.4));
        s.push(new Kreis(0.7));

        List<Object> l1 = new ArrayList<Object>();
        s.popAll(l1);
    }
}
