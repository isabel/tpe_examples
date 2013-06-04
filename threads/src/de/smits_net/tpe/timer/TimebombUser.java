/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.timer;

import java.util.Timer;

public class TimebombUser {

    public static void main(String[] args) throws Exception {

        Timer timer = new Timer("Timebomb", true);
        timer.schedule(new Timebomb(), 3000);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        timer.cancel();
    }
}
