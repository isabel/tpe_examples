/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.file;

import java.io.File;

public class DirLister {

    public static void main(String[] args) {

        File tempDir = new File("/");

        File[] filesInTemp = tempDir.listFiles();

        for (File file : filesInTemp) {
            System.out.printf(file.isDirectory() ? "d" : "-");
            System.out.printf(file.canRead()     ? "r" : "-");
            System.out.printf(file.canWrite()    ? "w" : "-");
            System.out.printf(file.canExecute()  ? "x" : "-");
            System.out.printf(file.isHidden()    ? "h" : "-");
            System.out.printf("  %,10d ", file.length());
            System.out.printf(" %1$tY-%1$tm-%1$td ", file.lastModified());
            System.out.printf(" %-18s%n", file.getName());
        }
    }
}
