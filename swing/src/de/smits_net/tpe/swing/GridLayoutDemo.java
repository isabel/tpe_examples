/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame window = new JFrame("Grid Layout");
        Container contentPane = window.getContentPane();
        contentPane.setLayout(new GridLayout(2, 3));
        contentPane.add(new JButton("A"));
        contentPane.add(new JButton("B"));
        contentPane.add(new JButton("C"));
        contentPane.add(new JButton("D"));
        contentPane.add(new JButton("E"));
        contentPane.add(new JButton("F"));
        window.pack();
        window.setVisible(true);
    }
}
