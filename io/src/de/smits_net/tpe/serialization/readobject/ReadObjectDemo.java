/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.readobject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObjectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        {
            Liste liste = new Liste();
            liste.add("A").add("B").add("C").add("D");
            System.out.println(liste);

            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("/tmp/liste.ser"));
            os.writeObject(liste);
            os.close();
        }
        {
            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("/tmp/liste.ser"));
            Liste liste = (Liste) is.readObject();
            is.close();
            System.out.println(liste);
        }

    }
}
