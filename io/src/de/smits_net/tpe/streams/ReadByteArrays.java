/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadByteArrays {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("/tmp/test.txt");

        byte[] daten = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(daten)) > -1) {
            // jetzt kann man etwas sinnvolles mit den Bytes machen, die aus
            // der Datei gelesen wurden
        }

        fis.close();

    }
}
