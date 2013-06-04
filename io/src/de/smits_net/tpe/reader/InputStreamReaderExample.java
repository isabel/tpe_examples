/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class InputStreamReaderExample {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("www.web.de", 80);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        Writer writer = new OutputStreamWriter(os);

        writer.write("GET / HTTP/1.0\r\n\r\n");
        writer.flush();

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        writer.close();
        socket.close();


    }
}
