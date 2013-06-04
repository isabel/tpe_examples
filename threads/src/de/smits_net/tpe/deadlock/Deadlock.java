/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.deadlock;

class T1 implements Runnable {
    public void run() {
        synchronized (Deadlock.lock1) {
            Thread.yield();
            synchronized (Deadlock.lock2) {
            }
        }
    }
}

class T2 implements Runnable {
    public void run() {
        synchronized (Deadlock.lock2) {
            Thread.yield();
            synchronized (Deadlock.lock1) {
            }
        }
    }
}

public class Deadlock {

    static class ClassForLock1 { /* empty */ }
    static class ClassForLock2 { /* empty */ }

    public static Object lock1 = new ClassForLock1();
    public static Object lock2 = new ClassForLock2();

    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.start(); t2.start();
    }
}
