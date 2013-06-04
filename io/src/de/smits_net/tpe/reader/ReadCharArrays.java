/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharArrays {

    public static void main(String[] args) throws IOException {

        Reader fr = new FileReader("/tmp/test.txt");

        char[] daten = new char[1024];
        int charactersRead;

        while ((charactersRead = fr.read(daten)) > -1) {
            // jetzt kann man etwas sinnvolles mit den Zeichen machen,
            // die aus der Datei gelesen wurden
        }

        fr.close();

    }
}
