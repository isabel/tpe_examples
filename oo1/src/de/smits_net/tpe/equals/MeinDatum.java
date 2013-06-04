/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.equals;

public class MeinDatum {
    int tag;
    int monat;
    int jahr;

    public MeinDatum(int tag, int monat, int jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + jahr;
        result = prime * result + monat;
        result = prime * result + tag;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MeinDatum other = (MeinDatum) obj;
        if (jahr != other.jahr)
            return false;
        if (monat != other.monat)
            return false;
        if (tag != other.tag)
            return false;
        return true;
    }
}
