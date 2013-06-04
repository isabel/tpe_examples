/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vola;

public class PossibleReordering {

    static int x = 0, y = 0, a = 0, b = 0;

    public static void main(String[] args) throws Exception {

        Thread one = new Thread(new Runnable() {
            public void run() {
                a = 1; x = b;
            }});

        Thread two = new Thread(new Runnable() {
            public void run() {
                b = 1; y = a;
            }});

        one.start(); two.start();
        one.join();  two.join();

        System.out.printf("x=%d, y=%d", x, y);
    }
}
