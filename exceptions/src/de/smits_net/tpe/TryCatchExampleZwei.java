/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TryCatchExampleZwei {

    public static void main(String[] args) {

        Connection connection = getConnection();

        try {
            ResultSet rs = readData(connection);

            while (rs.next()) {
                storeToFile(rs.getString(0), rs);
            }
        }
        catch (SQLException ex) {
            // Datenbank-Problem
            ex.printStackTrace();
        }
        catch (FileNotFoundException ex) {
            // Datei nicht gefunden
            System.out.println(ex.getMessage());
        }
        catch (IOException ex) {
            // Allgemeiner IO-Fehler
            System.out.println(ex.getMessage());
        }

    }

    private static ResultSet readData(Connection connection) throws SQLException {
        return null;
    }

    private static Connection getConnection() {
        return null;
    }

    public static void storeToFile(String fileName, ResultSet rs) throws FileNotFoundException, IOException {}



}
