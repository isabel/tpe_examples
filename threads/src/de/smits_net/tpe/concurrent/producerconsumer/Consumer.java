/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        try {

            while (true) {
                String element = queue.take();
                    System.out.println(Thread.currentThread().getName()
                            + ": " + element);
                    Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
