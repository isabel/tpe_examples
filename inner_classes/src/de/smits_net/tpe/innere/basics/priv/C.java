/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.basics.priv;

class C {

    C() {
        D d = new D();
        d.i = 100;
    }

    class D {
        private int i = 10;
    }
}
