/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.konstruktorhierarchie;

public class B extends A {

    protected int k;

    public B(int k) {
        this(k, 0);
    }

    public B(int k, int i) {
        super(i);
    }
}
