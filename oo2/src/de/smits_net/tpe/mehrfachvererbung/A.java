/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.mehrfachvererbung;

public class A implements I1, I2 {

    public static void main(String[] args) {
        //System.out.println(KONSTANTE);
        System.out.println(I1.KONSTANTE);
        System.out.println(I2.KONSTANTE);
    }
}
