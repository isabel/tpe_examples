/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

class Variablen {

    static int klassenVariable = 10;
    int member = 15;
    int empty;

    void methode(int i) {
        klassenVariable = 11;
        member++;
        empty++;

        int empty = 5;
        empty++;
        this.empty = 3;

        {
            int k = 5;
        }

        {
            int k = 6;
        }
    }
}

class BenutzeVariable {
    void doit() {
        Variablen.klassenVariable = 10;

        Variablen v1 = new Variablen();
        v1.empty = 5;

        Variablen v2 = new Variablen();
        v2.empty = 6;
        v2.member = 10;

        Variablen.klassenVariable = 10;
        Variablen v = new Variablen();
        v.klassenVariable = 15;
    }
}


