/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.custom;

public class Server {

    public static void connect(String host, int port) throws ServerException {

        int result = connectInternal(host, port);

        if (result == -1) {
            throw new ServerException("Cannot connect to " + host + ":" + port, host, port);
        }

        // ...

    }

    private static native int connectInternal(String host, int port);
}
