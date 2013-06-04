/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytes {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("/tmp/test.txt");

        int daten;

        while ((daten = fis.read()) > -1) {
            byte b = (byte) daten;
            // jetzt kann man etwas sinnvolles mit den Bytes machen, die aus
            // der Datei gelesen wurden
        }

        fis.close();

    }

    public static void falsch(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/tmp/test.txt");

        byte b;

        while ((b = (byte) fis.read()) > -1) {
            // jetzt kann man etwas sinnvolles mit den Bytes machen, die aus
            // der Datei gelesen wurden
        }

        fis.close();

    }
}
