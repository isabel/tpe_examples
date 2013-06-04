/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.CharArrayWriter;
import java.io.PrintWriter;

public class ArrayWriterDemo {

    public static void main(String[] args) {

        CharArrayWriter cw = new CharArrayWriter();
        PrintWriter pw = new PrintWriter(cw);

        pw.printf("<html><head><title>%s</title></head>%n", "Toller Titel");
        pw.printf("<body>%s</body></html>", "Ganz viel Body");

        pw.close();

        String webseite = cw.toString();

        System.out.println(webseite);
    }
}
