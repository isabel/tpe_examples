/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
