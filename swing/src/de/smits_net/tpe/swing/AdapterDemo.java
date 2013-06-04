/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class AdapterDemo {

    public static void main(String[] args) {

        JFrame jframe = new JFrame();

        jframe.addWindowListener(new WindowListener() {

            public void windowOpened(WindowEvent e) {}
            public void windowIconified(WindowEvent e) {}
            public void windowDeiconified(WindowEvent e) {}
            public void windowDeactivated(WindowEvent e) {}
            public void windowClosed(WindowEvent e) {}
            public void windowActivated(WindowEvent e) {}

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        jframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
