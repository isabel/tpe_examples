/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class KopierprogrammNIO {

    public static void main(String[] args) throws Exception {

        // Quell und Zieldatei
        String quelle = "/tmp/test.txt";
        String ziel = "/tmp/ziel.txt";

        // Streams für Quell und Zieldatei
        FileInputStream in = new FileInputStream(quelle);
        FileOutputStream out = new FileOutputStream(ziel);

        // Channels für die Dateien
        FileChannel fcin = in.getChannel();
        FileChannel fcout = out.getChannel();

        // Puffer für Dateiinhalt
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

        // Daten aus Quell- in Zieldatei kopieren
        while (fcin.read(buffer) >= 0) {
            buffer.flip();
            fcout.write(buffer);
            buffer.clear();
        }

        // Streams schließen (channels werden automatisch auch geschlossen)
        in.close();
        out.close();


    }
}
