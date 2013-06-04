/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.timer;

import java.util.TimerTask;

public class Countdown extends TimerTask {

    private int zaehler;

    public Countdown(int zaehler) {
        this.zaehler = zaehler;
    }

    @Override
    public void run() {
        if (zaehler-- <= 0) {
            System.out.println("Boom!");
            cancel();
        }
    }
}
