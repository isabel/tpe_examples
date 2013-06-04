/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

public class Interruptible implements Runnable {

    public void run() {

        while (true) {
            System.out.println("Thread laeuft");

            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            Thread.yield();
        }
        System.out.println("** Thread gestoppt **");
    }

    public static void main(String[] args) throws InterruptedException {
        Interruptible interuptible = new Interruptible();
        Thread thread = new Thread(interuptible);

        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
