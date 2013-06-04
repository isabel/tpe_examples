/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        // Quell und Zieldatei
        String quelle = "/tmp/quelle.txt";
        String ziel = "/tmp/ziel.txt";

        // Streams für Quell und Zieldatei
        InputStream in = new FileInputStream(quelle);
        OutputStream out = new FileOutputStream(ziel);

        byte[] buffer = new byte[1024];  // Puffer für Dateiinhalt
        int gelesen;                     // Anzahl der gelesenen Bytes

        // Daten aus Quell- in Zieldatei kopieren
        while ((gelesen = in.read(buffer)) > -1) {
            out.write(buffer, 0, gelesen);
        }

        // Streams schließen
        in.close();
        out.close();
    }
}
