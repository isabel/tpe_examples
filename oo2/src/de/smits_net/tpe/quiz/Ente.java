/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Ente {

    private static final Ente INSTANCE = new Ente();
    private static final int NORMAL_GROESSE = Integer.parseInt("12");

    private int groesse = NORMAL_GROESSE - 10;

    public int getGroesse() {
        return groesse;
    }

    public static void main(String[] args) {
        System.out.println(INSTANCE.getGroesse());
    }
}
