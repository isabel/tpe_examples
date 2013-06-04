/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.file;

import java.io.File;
import java.io.IOException;

public class CreateDir {

    public static void main(String[] args) throws IOException {

        File[] roots = File.listRoots();
        File tmpDir = new File(roots[0], "tmp");
        File newDir = new File(tmpDir, "new");
        File subDir = new File(newDir, "subdir");
        File txtFile = new File(subDir, "test.txt");
        subDir.mkdirs();
        txtFile.createNewFile();




    }
}
