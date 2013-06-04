/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

import java.io.FileInputStream;
import java.io.IOException;

public class CallStack3 {

    public static void main(String[] args) throws IOException {
        mergeData(args[0], "/tmp/output");
    }

    public static void mergeData(String inFile, String outFile)
            throws IOException {
        writeData(inFile, outFile);
    }

    public static void writeData(String inFile, String outFile) throws IOException {
        aggregate(5, 5, inFile);
    }

    public static int aggregate(int a, int b, String inFile) throws IOException {
        FileInputStream f = new FileInputStream(inFile);
        return 1;
    }
}
