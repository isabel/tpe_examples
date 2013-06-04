/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.trans;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Object schreiben
        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/tmp/transient.ser"));

        os.writeObject(new A("String1", "String2", "String3"));
        os.close();

        // Object lesen
        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/tmp/transient.ser"));

        A a = (A) is.readObject();
        is.close();

        System.out.println(a);
    }
}
