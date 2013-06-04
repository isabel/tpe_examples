/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.locks;

import java.util.concurrent.CountDownLatch;

public class Join {

    static CountDownLatch startLatch = new CountDownLatch(1);
    static CountDownLatch endLatch = new CountDownLatch(3);

    static class Runner implements Runnable {

        String text;

        Runner(String text) {
            this.text = text;
        }

        public void run() {

           try {
               startLatch.await();

               for (int i = 0; i < 5; i++) {
                   System.out.println(text);
                   Thread.yield();
               }
               System.out.println(text + " ist fertig.");
               endLatch.countDown();
           }
           catch (InterruptedException e) {
               // nothing to do
           }
        }
    }

    public static void main(String[] args) throws Exception {
        new Thread(new Runner("Runner 1")).start();
        new Thread(new Runner("Runner 2")).start();
        new Thread(new Runner("Runner 3")).start();

        startLatch.countDown(); // alle laufen los
        endLatch.await();       // warten bis alle fertig sind

        System.out.println("Alle fertig");

    }
}
