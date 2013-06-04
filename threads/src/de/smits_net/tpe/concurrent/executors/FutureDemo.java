/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1000); // unglaublich teure Berechnung ;-)
        return "Ergebnis";
    }
}

public class FutureDemo {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(new FutureCallable());

        System.out.println("Viele interessante Dinge parallel");

        try {
            String ergebnis = future.get();
            System.out.println(ergebnis);
        }
        catch (ExecutionException ex) { /* oops */ }
        System.out.println("Alles fertig");
    }
}
