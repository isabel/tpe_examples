/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.basics;

import java.util.Random;

class Runner3 implements Runnable {

    private HeapAndStackDemo hasd;

    public Runner3(HeapAndStackDemo hasd) {
        this.hasd = hasd;
    }

    private void doIt() {
        int a = new Random().nextInt(10);
        int b = new Random().nextInt(10);
        hasd.f = hasd.calc(a, b);
    }

    public void run() {
        while (true) {
            doIt();
            System.out.println(Thread.currentThread().getName() + ": " + hasd.f);
        }
    }
}

public class HeapAndStackDemo {

    int f;

    public int calc(int i, int j) {
        int temp = i + j;
        return temp;
    }

    public void go() {
        Runnable runner = new Runner3(this);
        new Thread(runner, "Thread-1").start();
        new Thread(runner, "Thread-2").start();
    }
}
