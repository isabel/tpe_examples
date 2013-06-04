/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.readresolve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/tmp/singleton.ser"));

        os.writeObject(TrueSingleton.getInstance());
        os.close();

        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/tmp/singleton.ser"));

        TrueSingleton singleton = (TrueSingleton) is.readObject();
        is.close();

        System.out.println(singleton == TrueSingleton.getInstance()); // --> false
    }
}
