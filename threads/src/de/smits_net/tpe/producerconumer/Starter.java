/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.producerconumer;

import java.util.LinkedList;
import java.util.Queue;

public class Starter {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread tp = new Thread(producer, "Producer");
        Thread c1 = new Thread(consumer, "Consumer 1");
        Thread c2 = new Thread(consumer, "Consumer 2");
        Thread c3 = new Thread(consumer, "Consumer 3");

        tp.start();
        c1.start();
        c3.start();
        c2.start();
    }
}
