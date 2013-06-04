/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.threadlocal;

public class ThreadLocalDemo implements Runnable {

    public void run() {
        Daten.tl.set(0);

        while (true) {
            int wert = Daten.tl.get();
            Daten.tl.set(++wert);
            System.out.printf("Thread %s: Wert=%d%n", Thread.currentThread().getName(), wert);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new ThreadLocalDemo();
        new Thread(runnable, "1").start();
        new Thread(runnable, "2").start();
    }
}
