/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.basics_innere;

public class ThreadDemo {

    public static void main(String[] args) throws Exception {

        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("Paraller Thread");
                    Thread.yield();
                }
            }
        });
        t.start();

        while (true) {
            System.out.println("Hauptprogramm");
            Thread.yield();
        }
    }
}
