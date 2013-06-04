/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.covariance;

import java.util.ArrayList;
import java.util.List;

class A { /* empty */  }
class B extends A { /* empty */ }

public class Covariance {

    public static void main(String[] args) {
        A[] a1 = new A[10];
        A[] a2 = new B[10];
        B[] b1 = (B[]) a2;

        a1[0] = new B();
        a1[1] = new A();

        a2[0] = new B();
        b1[0] = new B();

        ArrayList<A> l1 = new ArrayList<A>();
//        ArrayList<A> l2 = new ArrayList<B>();

        l1.add(new B());
    }

}
