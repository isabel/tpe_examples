/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.runnable;

class Runner2 implements Runnable {
    public void run() {
    }
}

public class BrokenRestart {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runner2();
        Thread t1 = new Thread(runnable, "Thread-1");
        t1.start();
        Thread.sleep(100);
        t1.start();
    }
}
