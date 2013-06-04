/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.sonicht;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 *
 * @author Thomas Smits
 */
public class BlossNicht {

    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fis = new FileInputStream("/tmp/gibtsnicht");
            String s = null;
            s = s.toUpperCase();
        }
        catch (Exception e) {
            // Fehlerbehandlung
        }

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("/tmp/gibtsnicht");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        fis.read();


    }
}
