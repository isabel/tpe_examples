/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

public class Interruptible3 implements Runnable {

    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Thread laeuft");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("** Thread gestoppt **");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Interruptible3());

        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
