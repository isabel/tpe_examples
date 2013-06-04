/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ellipse;

public class EllipseDetails {

        public void flexMethod(int ... werte) {
            for (int wert : werte) {
                // tu was
            }
        }

        public void verwender() {
            flexMethod(3, 5, 7, 13, 21, 23);
        }
}
