/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ArrayReaderDemo {

    public static void main(String[] args) throws IOException {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Nulla laoreet, sem vel mollis imperdiet, sapien mauris\n" +
                "sollicitudin arcu, sed viverra nulla dui at est.\n" +
                "Nunc est erat, semper id sollicitudin ut, pretium ac eros.\n";

        Reader sr = new StringReader(text);

        int gelesen;
        while ((gelesen = sr.read()) > -1) {
            System.out.print((char) gelesen);
        }

        sr.close();
    }
}
