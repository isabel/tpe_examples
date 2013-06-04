/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner1;

public class Zugriff {

    static class Inner1 {
        private int i;

        private void doIt(Inner2 inner2) {
            inner2.k++;
        }
    }

    static class Inner2 {
        private int k;

        private void doIt(Inner1 inner1) {
            inner1.i++;
        }
    }

    public void doIt(Inner1 i1, Inner2 i2) {
        i1.i = i2.k;
        i1.doIt(i2);
        i2.doIt(i1);
    }
}
