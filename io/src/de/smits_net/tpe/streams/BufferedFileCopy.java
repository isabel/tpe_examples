/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedFileCopy {
    public static void mainX(String[] args) throws IOException {

        String quelle = "/tmp/quelle.txt";
        String ziel = "/tmp/ziel.txt";

        InputStream in = new BufferedInputStream(
                new FileInputStream(quelle));

        OutputStream out = new BufferedOutputStream(
                new FileOutputStream(ziel));

        byte[] buffer = new byte[1024];
        int gelesen;

        while ((gelesen = in.read(buffer)) > -1) {
            out.write(buffer, 0, gelesen);
        }

        in.close();
        out.close();
    }
}
