/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryCatchExample {

    public static void main(String[] args) {

        Connection connection = getConnection();

        try {
            ResultSet rs = readData(connection);

            while (rs.next()) {
                // Daten bearbeiten
            }
        }
        catch (SQLException ex) {
            // Datenbank Problem behandeln
            String sqlStatus = ex.getSQLState();
            // ...
            ex.printStackTrace();
        }

    }

    private static ResultSet readData(Connection connection) throws SQLException {
        return null;
    }

    private static Connection getConnection() {
        return null;
    }

}
