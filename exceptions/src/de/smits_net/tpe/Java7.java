/* (c) 2011 Thomas Smits */
package de.smits_net.tpe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 *
 * @author Thomas Smits
 */
public class Java7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String titel = null;

        switch (titel) {
            case "Manager":
                break;

            case "Senior":
                break;

            default:
                break;
        }

        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        Set<?> set = new HashSet<>();

        new Java7().catchThrow();

        try {
            openFile();
            writeToDatabase();
        }
        catch (FileNotFoundException | SQLException e) {
            System.out.println("Ohje, alles kapput...:" + e);
        }
    }

    public static void openFile() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

     public static void writeToDatabase() throws SQLException {
        throw new SQLException();
    }


    public void catchThrow() {
        try {
            try {
               openFile();
           }
           catch (IOException e) {
               throw e;
           }
        }
        catch (Exception e) {
            System.out.println(e.getClass());
        }
    }


    public void resources() {
        try(FileInputStream fis = new FileInputStream("/tmp/file1");
           FileOutputStream fos = new FileOutputStream("/tmp/file2")) {

            int i = fis.read();
            fos.write(i);
        }
        catch (IOException e) {
            // Ausnahme behandeln
        }
    }


    public void resourcesOld() throws IOException {

        FileInputStream fis = new FileInputStream("/tmp/file1");
        FileOutputStream fos = new FileOutputStream("/tmp/file2");

        try {
            int i = fis.read();
            fos.write(i);
        }
        catch (IOException e) {
            // Ausnahme behandeln
        }
        finally {
            try {
                fis.close();
            }
            catch (IOException e) { /* ignore */ }

            try {
                fos.close();
            }
            catch (IOException e) { /* ignore */ }
        }
    }

}
