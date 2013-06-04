/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.wildcard;

public class GenericUser2 {

    public void adder(Generic<? super B> g) {
        g.add(new C());
        g.add(new B());
        //g.add(new A()); // könnte ein Generic<B> sein

        //B b = g.get(); // könnte ein Generic<A> sein
    }

    public void getter(Generic<? extends B> g) {
        A a = g.get();
        B b = g.get();
        //C c = g.get(); // könnte ein Generic<B> sein

        //g.add(new B()); // könnte ein Generic<C> sein
    }

    public void doIt() {
        //adder(new Generic<C>()); // A, B, C
        adder(new Generic<B>()); // A, B
        adder(new Generic<A>()); // A

        getter(new Generic<C>()); // A, B, C
        getter(new Generic<B>()); // A, B
        //getter(new Generic<A>()); // A
    }
}
