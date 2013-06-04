/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.custom;

public class ServerException extends Exception {

    private int port;
    private String host;

    public ServerException(String message, String host, int port) {
        super(message);
        this.host = host;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
