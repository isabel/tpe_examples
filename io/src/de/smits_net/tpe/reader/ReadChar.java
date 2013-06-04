/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadChar {

    public static void main(String[] args) throws IOException {

        Reader fr = new FileReader("/tmp/test.txt");

        int daten;

        while ((daten = fr.read()) > -1) {
            char c = (char) daten;
            // jetzt kann man etwas sinnvolles mit den Zeichen machen,
            // die aus der Datei gelesen wurden
        }

        fr.close();

    }

    public static void falsch(String[] args) throws IOException {

        FileReader fr = new FileReader("/tmp/test.txt");

        char b;

        while ((b = (char) fr.read()) > -1) {
            // jetzt kann man etwas sinnvolles mit den Zeichen machen,
            // die aus der Datei gelesen wurden
        }

        fr.close();

    }
}
