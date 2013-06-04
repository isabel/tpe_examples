/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.producerconumer;

import java.util.Queue;

public class Producer implements Runnable {

    Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        int i = 0;

        try {
            while (true) {
                synchronized (queue) {

                    while (queue.size() >= 10) {
                        queue.wait();
                    }

                    queue.add("P" + ++i);
                    queue.notifyAll();
                }

                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
