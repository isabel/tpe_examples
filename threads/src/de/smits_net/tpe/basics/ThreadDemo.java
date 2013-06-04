/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

class Runner implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Paralleler Thread");
            Thread.yield();
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runner());
        t.start();

        while (true) {
            System.out.println("Hauptprogramm");
            Thread.yield();
        }
    }
}
