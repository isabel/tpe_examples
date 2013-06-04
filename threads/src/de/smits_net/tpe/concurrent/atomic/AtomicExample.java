/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample implements Runnable {

    private final AtomicInteger counter = new AtomicInteger(1);

    public void run() {
        while (counter.getAndIncrement() > 0) {
            System.out.printf("Wert: %d%n", counter.get());
            Thread.yield();
        }
        System.out.println("** Gestoppt **");
    }

    public static void main(String[] args) throws Exception {
        AtomicExample st = new AtomicExample();
        Thread thread = new Thread(st);

        thread.start();
        Thread.sleep(100);
        st.counter.set(-1);
    }
}
