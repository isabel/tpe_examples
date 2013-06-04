/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ueberschreiben;

class A {

    public void method(Object o) {
        // ...
    }
}

class B extends A {

//    @Override
    public void method(String o) {
        // ...
    }
}