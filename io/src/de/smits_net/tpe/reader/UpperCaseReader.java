/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.reader;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class UpperCaseReader extends FilterReader {

    protected UpperCaseReader(Reader in) {
        super(in);
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int result = super.read(cbuf, off, len);

        for (int i = off; i < off + result; i++) {
            cbuf[i] = Character.toUpperCase(cbuf[i]);
        }

        return result;
    }
}
