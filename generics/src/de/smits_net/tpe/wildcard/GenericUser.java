/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.wildcard;

public class GenericUser {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        Generic<A> ga = new Generic<A>();
        Generic<B> gb = new Generic<B>();
        Generic<C> gc = new Generic<C>();

        ga.add(a); ga.add(b); ga.add(c);
        gb.add(b); gb.add(c);
        gc.add(c);

        Generic<? extends A> gea = ga;
        gea = gb; gea = gc;

        Generic<? extends B> geb = gb;
        geb = gc;

        Generic<? extends C> gec = gc;

        Generic<? super A> gsa = ga;

        Generic<? super B> gsb = gb;
        gsb = ga;

        Generic<? super C> gsc = gc;
        gsc = gb; gsc = ga;
    }
}
