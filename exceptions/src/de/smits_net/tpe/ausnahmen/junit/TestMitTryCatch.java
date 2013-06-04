/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ausnahmen.junit;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import org.junit.Test;

public class TestMitTryCatch {

    @Test
    public void testAufAusnahme() {

        try {
            new String((String) null);
            fail();

        }
        catch (NullPointerException ex) {
            assertTrue(true);
        }
    }
}
