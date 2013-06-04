/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.basics_innere;

public class DaemonDemo {

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true);
            }
        });

        t.setDaemon(true);
        t.start();
    }
}
