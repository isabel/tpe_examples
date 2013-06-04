/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrent.locks;

import java.sql.Connection;
import java.util.concurrent.Semaphore;

public class ConnectionPool {

    private static final int NUM_CON = 5;
    private Semaphore sem = new Semaphore(NUM_CON);

    public synchronized Connection getConnection() throws InterruptedException {
        sem.acquire();
        return getFreeConnection();
    }

    public synchronized void releaseConnection(Connection con) {
        try {
            recycleConnection(con);
        }
        finally {
            sem.release();
        }
    }


    private void recycleConnection(Connection con) {
    }

    private Connection getFreeConnection() {
        return null;
    }

    public static void main(String[] args) {
    }
}
