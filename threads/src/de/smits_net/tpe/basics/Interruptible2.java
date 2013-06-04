/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

public class Interruptible2 implements Runnable {

    public void run() {

        while (true) {
            System.out.println("Thread laeuft");

            if (Thread.currentThread().isInterrupted()) {
                break;
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("** Thread gestoppt **");
    }

    public static void main(String[] args) throws InterruptedException {
        Interruptible2 interuptible = new Interruptible2();
        Thread thread = new Thread(interuptible);

        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
