/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileReadExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/tmp/test.txt");
        FileChannel fc = fis.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        fc.read(buffer);

        fis.close();
    }
}
