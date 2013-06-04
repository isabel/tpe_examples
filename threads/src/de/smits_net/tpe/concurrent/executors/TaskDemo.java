/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name);
            Thread.yield();
        }
    }
}

public class TaskDemo {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new Task("Task 1"));
        ex.execute(new Task("Task 2"));

        ScheduledExecutorService ex2 = Executors.newScheduledThreadPool(3);
        ex2.schedule(new Task("Delayed 1"), 5, TimeUnit.SECONDS);
        ex2.schedule(new Task("Delayed 2"), 10, TimeUnit.SECONDS);

    }
}
