/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.basics.vererbung;

import java.io.Serializable;
import java.util.ArrayList;

class A {
    class B { }
    class C extends B { }
    class D<T> extends ArrayList<T> { }
    class E implements Serializable { }
}
