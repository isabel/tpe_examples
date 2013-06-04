/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.polymorphie;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class B extends A {

    public void method() throws IOException, FileNotFoundException {
    }
}

class C extends A {

    public void method() throws FileNotFoundException {
    }
}

class D extends A {

    public void method() {
    }
}

//class E extends A {
//
//    public void method() throws SQLException {
//    }
//}
