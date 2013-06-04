/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

class RunnerPrinter implements Runnable {

    String text;

    RunnerPrinter(String text) {
        this.text = text;
    }
    public void run() {
       for (int i = 0; i < 5; i++) {
           System.out.println(text);
           Thread.yield();
       }

       System.out.println(text + " ist fertig.");
    }
}

public class Join {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new RunnerPrinter("Runner 1"));
        Thread t2 = new Thread(new RunnerPrinter("Runner 2"));
        Thread t3 = new Thread(new RunnerPrinter("Runner 3"));

        t1.start(); t2.start(); t3.start();

        t1.join(); t2.join(); t3.join();

        System.out.println("Alle fertig");
    }
}
