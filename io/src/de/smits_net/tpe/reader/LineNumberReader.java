/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineNumberReader {

    public static void main(String[] args) throws IOException {

        String dateiname = "/tmp/text.txt";

        BufferedReader reader = new BufferedReader(
                new FileReader(dateiname));

        String zeile;
        int nummer = 1;
        while ((zeile = reader.readLine()) != null) {
            System.out.printf("%03d %s%n", nummer, zeile);
            nummer++;
        }

        reader.close();
    }
}
