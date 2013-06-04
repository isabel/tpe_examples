/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.readresolve;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class TrueSingleton implements Serializable {

    private static final TrueSingleton instanz = new TrueSingleton();

    private TrueSingleton() {
        // keine Instanzen zulassen
    }

    public static TrueSingleton getInstance() {
        return instanz;
    }

    private Object readResolve() throws ObjectStreamException {
        return TrueSingleton.instanz;
    }
}
