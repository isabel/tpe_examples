/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

class Scope {

    int i = 1;

    void methode1() {
        int i = 4;
        int j = 5;

        this.i = i + j;
        methode2(7);
    }

    void methode2(int i) {
        int j=8;
        this.i = i + j;
    }

    public static void main(String[] args) {
        Scope s = new Scope();
        s.methode1();
    }
}
