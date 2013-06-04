/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.runnable;

class Runner implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Runnable runner = new Runner();

        Thread t1 = new Thread(runner, "Thread-1");
        Thread t2 = new Thread(runner, "Thread-2");
        t1.start();
        t2.start();

        while (true) {
            System.out.println("Hauptprogramm");
            Thread.yield();
        }
    }
}
