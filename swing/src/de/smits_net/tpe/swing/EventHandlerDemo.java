/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventHandlerDemo {

    public static void main(String[] args) {

        JFrame window = new JFrame("Fenster");
        JPanel panel = new JPanel();

        JButton button = new JButton("Knopf");
        button.setActionCommand("knopf");

        panel.add(button);

        window.setContentPane(panel);
        window.pack();
        window.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand() + " wurde geklickt");
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ((JButton) e.getSource()).setEnabled(false);
            }
        });

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
