/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.unittest;

import static org.junit.Assert.*;
import org.junit.Test;

public class KomplexeZahlTest {

    @Test
    public void testAddition() {
        KomplexeZahl k1 = new KomplexeZahl(3, 2);
        KomplexeZahl k2 = new KomplexeZahl(5, 5);
        assertEquals(new KomplexeZahl(8, 7), k1.addiere(k2));
    }

    @Test
    public void testSubtraktion() {
        KomplexeZahl k1 = new KomplexeZahl(5, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 2);
        assertEquals(new KomplexeZahl(2, 3), k1.subtrahiere(k2));
    }

    @Test
    public void testMultiplikation() {
        KomplexeZahl k1 = new KomplexeZahl(2, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 7);
        assertEquals(new KomplexeZahl(-29, 29), k1.multipliziere(k2));
    }

    @Test
    public void testDivision() {
        KomplexeZahl k1 = new KomplexeZahl(2, 5);
        KomplexeZahl k2 = new KomplexeZahl(3, 7);
        assertEquals(new KomplexeZahl(41.0/58.0, 1.0/58.0), k1.dividiere(k2));
    }
}
