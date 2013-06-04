/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;

public class MenuDemo {

    public static void main(String[] args) {
        JFrame window = new JFrame("Mit Menue");

        Menu fileMenu = new Menu("Ablage");
        fileMenu.add(new MenuItem("Sichern"));
        fileMenu.add(new MenuItem("Sichern unter..."));
        fileMenu.addSeparator();
        fileMenu.add(new MenuItem("Drucken"));

        Menu helpMenu = new Menu("Hilfe");
        helpMenu.add(new MenuItem("Cheat sheet"));

        MenuBar menuBar = new MenuBar();
        menuBar.setHelpMenu(helpMenu);
        menuBar.add(fileMenu);
        window.setMenuBar(menuBar);

        window.pack();
        window.setVisible(true);
    }
}
