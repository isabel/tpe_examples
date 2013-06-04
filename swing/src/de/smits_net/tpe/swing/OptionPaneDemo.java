/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneDemo {

    public static void main(String[] args) {
        JFrame window = new JFrame("Option Pane");
        window.pack();
        window.setVisible(true);

        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(window);


        JOptionPane.showConfirmDialog(window, "Sind sie sicher?", "Sicherheitsabfrage",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        JOptionPane.showConfirmDialog(window,
                "Alle Daten wurden gelöscht", "Hinweis",
                JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);

        JOptionPane.showInputDialog(window,
                "Bitte wählen Sie Ihre Glücksmelodie",
                "Eingabe", JOptionPane.PLAIN_MESSAGE);

        Object[] possibleValues = { "Eintrag A", "Eintrag B", "Eintrag C" };
        JOptionPane.showInputDialog(window, "Bitte wählen", "Eingabe",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[1]);




    }
}
