/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class XYLayout {

    public static void main(String[] args) {
        JFrame window = new JFrame("XY Layout");

        JLabel label = new JLabel("Label");


        Container contentPane = window.getContentPane();
        contentPane.add(label);
        contentPane.setLayout(null);
        label.setLocation(10, 10);
        window.pack();
        window.setVisible(true);
    }
}
