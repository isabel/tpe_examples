/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

import java.io.FileInputStream;
import java.io.IOException;

public class CallStack2 {

    public static void main(String[] args) throws IOException {
        mergeData("/tmp/input", "/tmp/output");
    }

    public static void mergeData(String inFile, String outFile)
            throws IOException {
        writeData(outFile);
    }

    public static void writeData(String outFile) throws IOException {
        aggregate(5, 5);
    }

    public static int aggregate(int a, int b) throws IOException {
        FileInputStream f = new FileInputStream("/tmp/input");
        return 1;
    }
}
