
package de.smits_net.tpe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Thomas Smits
 */
public class HandleOrDeclare {

    public void openFile(String dateiName)
            throws IOException, FileNotFoundException {
        // Datei öffnen
    }

    public void datenSchreiben(String dateiName, String sqlStatement)
            throws FileNotFoundException, IOException, SQLException {

        openFile(dateiName);
        // Mit Datenbank arbeiten
    }

    public void dateiAnlegen(String dateiName)
            throws FileNotFoundException, IOException {

        try {
            datenSchreiben(dateiName, "SELECT * FROM x");
        }
        catch (SQLException ex) {
            // Datenbank Problem beheben ;-)
         }
    }

    public void userInterface() {
        String dateiName = askUser();

        try {
            dateiAnlegen(dateiName);
        }
        catch (FileNotFoundException ex) {
            // Benutzer erneut nach namen Fragen
        }
        catch (IOException ex) {
            // Benutzer auf Problem hinweisen
        }
    }

    public String askUser() {
        return null;
    }
}
