/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryCatchFinallyExample2 {

    public static void main(String[] args) {

        Connection connection = getConnection();

        try {
            ResultSet rs = readData(connection);

            while (rs.next()) {
                // Daten bearbeiten
            }

            return;
        }
        catch (SQLException ex) {
            // Datenbank Problem behandeln
        }
        finally {
            try {
                releaseConnection(connection);
            }
            catch (SQLException ex) {
                // Hier kann man nichts mehr machen
            }
        }

    }

    private static ResultSet readData(Connection connection) throws SQLException {
        return null;
    }

    private static Connection getConnection() {
        return null;
    }

    private static void releaseConnection(Connection connection) throws SQLException {

    }

}
