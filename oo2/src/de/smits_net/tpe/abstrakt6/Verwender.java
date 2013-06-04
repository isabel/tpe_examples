/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt6;

public class Verwender {

    public static void main(String[] args) {
        A b = new B();

        b.konkret();
        b.abstrakt1();
        b.abstrakt2();

        A d = new E();
        d.konkret();
        d.abstrakt1();
        d.abstrakt2();

        A g = new G();     g.konkret();     g.abstrakt1();     g.abstrakt2();


    }
}
