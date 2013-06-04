/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.basics_innere;

import java.util.Random;

public class HeapAndStackDemo {

    int f;

    public int calc(int i, int j) {
        int temp = i + j;
        return temp;
    }

    class Runner implements Runnable {

        private void doIt() {
            int a = new Random().nextInt(10);
            int b = new Random().nextInt(10);
            f = calc(a, b);
        }

        public void run() {
            while (true) {
                doIt();
                System.out.println(Thread.currentThread().getName() + ": " + f);
            }
        }
    }

    public void go() {
        Runnable runner = new Runner();
        new Thread(runner, "Thread-1").start();
        new Thread(runner, "Thread-2").start();
    }
}
