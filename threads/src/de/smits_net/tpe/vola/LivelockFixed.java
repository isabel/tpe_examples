/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vola;

class Looper implements Runnable {

    static volatile boolean cont = true;

    public void run() {
        while (cont) {
            // mach was
        }
    }
}
public class LivelockFixed {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Looper());

        t.start();

        Thread.sleep(1000);
        Looper.cont = false;
    }
}
