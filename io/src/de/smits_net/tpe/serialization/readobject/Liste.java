/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.readobject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Liste implements Serializable {

    class Element implements Serializable {

        Element next;
        String daten;

        Element(String daten) {
            this.daten = daten;
        }
    }

    transient Element erstes;
    transient Element aktuelles;

    public Liste add(String daten) {
        if (erstes == null) {
            erstes = new Element(daten);
            aktuelles = erstes;
        }
        else {
            Element neu = new Element(daten);
            aktuelles.next = neu;
            aktuelles = neu;
        }

        return this;
    }

    @Override
    public String toString() {

        if (erstes == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();

        Element e = erstes;

        while (e != null) {
            sb.append(e.daten).append(", ");
            e = e.next;
        }

        return sb.toString();
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();

        for (Element e = erstes; e != null; e = e.next) {
            os.writeUTF(e.daten);
        }
        os.writeUTF("");
    }

    private void readObject(ObjectInputStream is)
            throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        String string;

        while ((string = is.readUTF()).length() > 0) {
            add(string);
        }
    }
}
