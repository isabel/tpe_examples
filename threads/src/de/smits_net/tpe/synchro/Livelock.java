/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro;

class Looper implements Runnable {

    private boolean cont = true;

    public void requestStop() {
        cont = false;
    }

    public void run() {
        while (cont) {
            // mach was
        }
    }

}
public class Livelock {

    public static void main(String[] args) throws InterruptedException {

        Looper looper = new Looper();
        Thread t = new Thread(looper);
        t.start();

        Thread.sleep(1000);
        looper.requestStop();
    }
}
