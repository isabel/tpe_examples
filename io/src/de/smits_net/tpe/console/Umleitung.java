/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Umleitung {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream("/tmp/umleitung.txt");
        System.setOut(ps);
        System.out.println("Hallo, das kommt ja gar nicht raus...");
        ps.close();
    }
}
