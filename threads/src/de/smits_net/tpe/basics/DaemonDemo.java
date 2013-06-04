/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

class DaemonRunner implements Runnable {
    public void run() {
        while (true);
    }
}

public class DaemonDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonRunner());
        t.setDaemon(true);
        t.start();
    }
}
