/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.callable;

import java.util.concurrent.Callable;

class RechnerCallable implements Callable<Integer> {

    public Integer call() throws Exception {
        return 2+2;
    }
}

class RechnerRunnable implements Runnable {

    private int result;
    private Exception e;

    public int getResult() {
        return result;
    }

    public Exception getException() {
        return e;
    }

    public void run() {
        try {
            result = 2+2;
        }
        catch (Exception ex) {
            this.e = ex;
        }
    }
}
