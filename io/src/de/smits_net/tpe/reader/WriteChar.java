/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteChar {

    public static void main(String[] args) throws IOException {

        Writer fw = new FileWriter("/tmp/mytext");

        fw.write('T');
        fw.write('e');
        fw.write('x');
        fw.write('t');
        fw.write('\n');

        fw.close();

    }
}
