/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.inner7;

import java.util.Date;

public class WasIstDennDas {

    public static void main(String[] args) {
        Date date = new Date() {{ setTime(400000000000L); }};
        System.out.println(date);
    }
}
