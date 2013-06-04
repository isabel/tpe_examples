/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro;

class Looper2 implements Runnable {

    private boolean cont = true;

    public synchronized void requestStop() {
        cont = false;
    }

    public void run() {
        while (cont) {
            // mach was
        }
    }

}
public class LiveLock2 {

    public static void main(String[] args) throws InterruptedException {

        Looper3 looper = new Looper3();
        Thread t = new Thread(looper);
        t.start();

        Thread.sleep(1000);
        looper.requestStop();
    }
}
