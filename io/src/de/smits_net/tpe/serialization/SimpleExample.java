/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SimpleExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Manager m = new Manager("Hans Alberts", 10000.0,
                new Date(0x2222222222L), "Buchhaltung");

        ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/tmp/albert.ser"));

        os.writeObject(m);
        os.close();

        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/tmp/albert.ser"));

        Manager albert = (Manager) is.readObject();

        is.close();

        System.out.println(albert.getDetails());

    }
}
