/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class MemoryMappedFile {

    public static void main(String[] args) throws Exception {
        RandomAccessFile fis = new RandomAccessFile(
                "/Users/thomas/Temp/bigmama", "rw");
        FileChannel fc = fis.getChannel();
        fc.map(MapMode.READ_WRITE, 0, 1024L*1024*1024*8);
        fc.close();
    }
}
