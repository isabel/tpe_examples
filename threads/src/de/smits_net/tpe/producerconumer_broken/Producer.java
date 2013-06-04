/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.producerconumer_broken;

import java.util.Queue;

public class Producer implements Runnable {

    Queue<String> queue;

    public Producer(Queue<String> queue) {
        this.queue = queue;
    }

    public  boolean checkQueueFull() {
        synchronized (queue) {
            return queue.size() >= 10;
        }
    }

    public void run() {

        int i = 0;

        try {
            while (true) {

                    while (checkQueueFull()) {
                        queue.wait();
                    }
                    synchronized (queue) {

                    String elemnt ="P" + ++i;
                    queue.add(elemnt);
                    System.out.println(Thread.currentThread().getName() + ": Habe produziert " + elemnt);
                    queue.notifyAll();
                }

                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
        }
    }
}
