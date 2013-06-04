/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteByteArrays {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("/tmp/myfile");

        byte[] daten = { (byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe };

        fos.write(daten);
        fos.write(daten, 0, 2);
        fos.write(daten, 0, 2);
        fos.write(daten, 2, 2);
        fos.write(daten, 2, 2);

        fos.close();

    }
}
