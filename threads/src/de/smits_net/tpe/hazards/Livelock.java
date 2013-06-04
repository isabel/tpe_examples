/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.hazards;

class Looper implements Runnable {

    static boolean cont = true;

    public void run() {
        while (cont) {
            // mach was
        }
    }
}
public class Livelock {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Looper());

        t.start();

        Thread.sleep(1000);
        Looper.cont = false;
    }
}
