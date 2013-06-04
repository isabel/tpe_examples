/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ausnahmen.junit;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class BrokenTest {

    @Test (expected = NullPointerException.class)
    public void testKaputt() {
        String s1 = new String("Hallo");
        assertEquals("Hallo", s1);

        new String((String) null);
        new String((char[]) null);

        String s3 = new String("World");
        assertEquals("world", s3);
    }
}
