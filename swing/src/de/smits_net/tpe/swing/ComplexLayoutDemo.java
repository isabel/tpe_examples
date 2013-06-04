/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ComplexLayoutDemo {

    public static void main(String[] args) {
        JFrame window = new JFrame("Complex Layout");
        Container contentPane = window.getContentPane();

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(new JLabel("Filter"));
        p1.add(new JTextField(10));

        JList list = new JList(new Object[] {
                "Eintrag A", "Eintrag B", "Eintrag C",
                "Eintrag D", "Eintrag E", "Eintrag F",
                "Eintrag G", "Eintrag H", "Eintrag I"});
        JScrollPane scrollPane = new JScrollPane(list);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(new JButton("OK"));
        p2.add(new JButton("Abbrechen"));

        contentPane.add(scrollPane, BorderLayout.CENTER);
        contentPane.add(p1, BorderLayout.NORTH);
        contentPane.add(p2, BorderLayout.SOUTH);

        window.pack();
        window.setVisible(true);
    }
}
