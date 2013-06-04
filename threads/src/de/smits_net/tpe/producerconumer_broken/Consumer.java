/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.producerconumer_broken;

import java.util.Queue;

public class Consumer implements Runnable {

    Queue<String> queue;

    public Consumer(Queue<String> queue) {
        this.queue = queue;
    }

    public boolean checkQueueEmpty() {
        synchronized (queue) {
            return queue.isEmpty();
        }
    }

    public void run() {

        try {

            while (true) {

                    while (checkQueueEmpty()) {
                       // queue.wait();
                    }

                    synchronized (queue) {

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
