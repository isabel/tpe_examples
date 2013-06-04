/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.unittest;

public class KomplexTest {

    public void testAddition() {
        KomplexeZahl k1 = new KomplexeZahl(3, 2);
        KomplexeZahl k2 = new KomplexeZahl(5, 5);

        if (k1.addiere(k2).equals(new KomplexeZahl(8, 7))) {
            System.out.println("OK: Addition");
        }
        else {
            System.err.println("Fehler: Addition");
        }
    }

    public void testSubtraktion() {
        KomplexeZahl k1 = new KomplexeZahl(5, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 2);

        if (k1.subtrahiere(k2).equals(new KomplexeZahl(2, 3))) {
            System.out.println("OK: Subtraktion");
        }
        else {
            System.err.println("Fehler: Subtraktion");
        }
    }

    public void testMultiplikation() {
        KomplexeZahl k1 = new KomplexeZahl(2, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 7);

        if (k1.multipliziere(k2).equals(new KomplexeZahl(-29, 29))) {
            System.out.println("OK: Multiplikation");
        }
        else {
            System.err.println("Fehler: Multiplikation");
        }
    }

    public void testDivision() {
        KomplexeZahl k1 = new KomplexeZahl(2, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 7);

        if (k1.dividiere(k2).equals(new KomplexeZahl(41.0/58.0, 1.0/58.0))) {
            System.out.println("OK: Division");
        }
        else {
            System.err.println("Fehler: Divison");
        }
    }

    public static void main(String[] args) {
        KomplexTest test = new KomplexTest();
        test.testAddition();
        test.testSubtraktion();
        test.testMultiplikation();
        test.testDivision();
    }
}
