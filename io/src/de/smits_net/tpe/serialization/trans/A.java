/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization.trans;

import java.io.Serializable;

public class A implements Serializable {

    private String s1;
    private String s2;
    private transient String s3;

    public A(String s1, String s2, String s3) {
        if ((s1 == null) || (s2 == null) || (s3 == null)) {
            throw new NullPointerException();
        }

        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return String.format("A [s1=%s, s2=%s, s3=%s]", s1, s2, s3);
    }
}
