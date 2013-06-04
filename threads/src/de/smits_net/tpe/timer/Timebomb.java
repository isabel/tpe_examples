/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.timer;

import java.util.TimerTask;

public class Timebomb extends TimerTask {

    @Override
    public void run() {
        System.out.println("Boom!");
        cancel();
    }
}
