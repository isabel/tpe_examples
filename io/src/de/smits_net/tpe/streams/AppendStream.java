/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 *
 * @author Thomas Smits
 */
public class AppendStream {

    public static void main(String[] args) throws IOException {

        byte[] daten = { (byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe };
        {
            OutputStream fos = new FileOutputStream("/tmp/myfile");
            fos.write(daten);
            fos.close();
        }

        {
            OutputStream fos2 = new FileOutputStream("/tmp/myfile", true);
            fos2.write(daten);
            fos2.close();
        }

    }
}
