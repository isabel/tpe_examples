/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

class Datum {
    int tag;
    int monat;
    int jahr;
}

class Verwender {

    void m() {
        Datum d = new Datum();
        d.tag = 32;

        d.tag = 30; d.monat = 2;

        d.tag = 31;
        d.tag++;
    }
}

class Datum2 {
    private int tag;
    private int monat;
    private int jahr;

    public void setTag(int tag) {

        if (tag > 31) {
            tag = 31;
        }

        this.tag = tag;
    }
}
