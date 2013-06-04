/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.quiz;

import java.awt.Point;

public class Reference {

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = p1;

        p2.setLocation(5, 6);

        System.out.println(p1);
        System.out.println(p2);
    }
}
