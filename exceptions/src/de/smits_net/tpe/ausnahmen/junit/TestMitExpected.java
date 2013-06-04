package de.smits_net.tpe.ausnahmen.junit;

import org.junit.Test;

/*
 * (c) 2009 Thomas Smits
 */

public class TestMitExpected {

    @Test (expected = NullPointerException.class)
    public void testAufAusnahme() {
        new String((String) null);
    }
}
