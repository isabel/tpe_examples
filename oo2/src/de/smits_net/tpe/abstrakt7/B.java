/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt7;

public abstract class B extends A {

    @Override
    public void abstrakt1() {
        System.out.println("Abstrakt 1 aus B");
    }

    public abstract void abstrakt3();

    public void konkret2() {
        System.out.println("Konkret 2 aus B");
    }
}
