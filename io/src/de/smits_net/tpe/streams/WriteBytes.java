/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytes {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("/tmp/myfile");

        fos.write(0xca);
        fos.write(0xfe);
        fos.write(0xba);
        fos.write(0xbe);

        fos.close();

    }
}
