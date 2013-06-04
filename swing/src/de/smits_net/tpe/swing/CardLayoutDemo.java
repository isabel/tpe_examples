/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo {

    public static void main(String[] args) {
        JFrame window = new JFrame("Card Layout");
        Container contentPane = window.getContentPane();
        contentPane.setLayout(new CardLayout());
        contentPane.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        contentPane.add(new JButton("NORTH"), BorderLayout.NORTH);
        contentPane.add(new JButton("WEST"), BorderLayout.WEST);
        contentPane.add(new JButton("EAST"), BorderLayout.EAST);
        contentPane.add(new JButton("CENTER"), BorderLayout.CENTER);
        window.pack();
        window.setVisible(true);
    }
}
