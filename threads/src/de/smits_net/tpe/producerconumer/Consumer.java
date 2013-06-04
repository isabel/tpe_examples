/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.producerconumer;

import java.util.Queue;

public class Consumer implements Runnable {

    Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    public void run() {

        try {

            while (true) {
                synchronized (queue) {

                    while (queue.isEmpty()) {
                        queue.wait();
                    }

                    String element = queue.poll();
                    queue.notifyAll();

                    System.out.println(Thread.currentThread().getName()
                            + ": " + element);
                }
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
