/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.basics;

public class Stoppable implements Runnable {

    private volatile boolean cont = true;

    public void requestTermination() {
        cont = false;
    }

    public void run() {
        while (cont) {
            System.out.println("Thread laeuft");
            Thread.yield();
        }
        System.out.println("** Stoppable gestoppt **");
    }

    public static void main(String[] args) throws InterruptedException {
        Stoppable st = new Stoppable();
        Thread thread = new Thread(st);

        thread.start();
        Thread.sleep(100);
        st.requestTermination();
    }
}
