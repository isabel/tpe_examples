/* (c) 2011 Thomas Smits */


import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class MemoryMappedFile {

    public static void main(String[] args) throws Exception {
        RandomAccessFile fis = new RandomAccessFile(args[0], "rw");
        FileChannel fc = fis.getChannel();
        fc.map(MapMode.READ_WRITE, 0, Integer.parseInt(args[1]));
        fc.close();
    }
}
