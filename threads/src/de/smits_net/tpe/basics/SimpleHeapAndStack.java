/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.basics;

import java.util.Random;


class Runner4 implements Runnable {

    private int zaehler = 0;

    @Override
    public void run() {
        int local = new Random().nextInt();

        while (true) {
            zaehler = local++;
        }
    }
}

public class SimpleHeapAndStack {

    public static void main(String[] args) {
        Runner4 runner = new Runner4();
        Thread t1 = new Thread(runner, "Thread-1");
        Thread t2 = new Thread(runner, "Thread-2");

        t1.start();
        t2.start();
    }
}
