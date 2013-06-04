/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ellipse;

public class EllipseDemo {

    public void flexibleMethode(String name, int ... attributes) {
        int summe = 0;

        for (int i = 0; i < attributes.length; i++) {
            summe += attributes[i];
        }

        System.out.println(name + " ist " + summe);
    }

    public static void main(String[] args) {
        EllipseDemo demo = new EllipseDemo();
        demo.flexibleMethode("Primsumme bis 13", 1, 3, 5, 7, 13);
        demo.flexibleMethode("Gar nichts");
    }
}
