/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        int i = 0;

        try {
            while (true) {
                queue.put("P" + ++i);
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
