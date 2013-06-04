/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteCharArrays {

    public static void main(String[] args) throws IOException {

        Writer fw = new FileWriter("/tmp/mytext");

        String daten = "Dies ist ein Text";

        fw.write(daten);
        fw.write(daten, 0, 5);
        fw.write(daten, 0, 5);
        fw.write(daten, 12, 5);
        fw.write(daten, 12, 5);

        fw.write("\n");

        fw.close();

    }
}
