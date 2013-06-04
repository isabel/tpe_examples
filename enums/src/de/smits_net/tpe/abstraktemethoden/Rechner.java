/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstraktemethoden;

public class Rechner {

    public double rechne(double op1, double op2, Operation operation) {
        return operation.anwenden(op1, op2);
    }

    public static void main(String[] args) {
        Rechner r = new Rechner();

        double summe = r.rechne(5, 5, Operation.ADDITION);
        double differenz = r.rechne(6, 3, Operation.SUBTRAKTION);
        double produkt = r.rechne(6, 3, Operation.MULTIPLIKATION);

        System.out.printf("%.0f, %.0f, %.0f", summe, differenz, produkt);
    }
}
