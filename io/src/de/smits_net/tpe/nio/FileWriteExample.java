/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileWriteExample {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("/tmp/output.txt");
        FileChannel fc = fos.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(128);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());

        buffer.put("Hello World\n".getBytes());
        buffer.flip();
        fc.write(buffer);

        fos.close();

    }
}
