/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.interface5;

public class Telefonnummer implements Comparable {

    private int vorwahl;
    private int nummer;

    public int compareTo(Object o) {
        Telefonnummer n = (Telefonnummer) o;

        if (vorwahl > n.vorwahl) {
            return 1;
        } else if (vorwahl < n.vorwahl) {
            return -1;
        } else {
            // vorwahl == n.vorwahl
            if (nummer > n.nummer) {
                return 1;
            } else if (nummer < n.nummer) {
                return -1;
            }
        }

        return 0;
    }

    public Telefonnummer(int vorwahl, int nummer) {
        this.vorwahl = vorwahl;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return String.format("(%d) %d", vorwahl, nummer);
    }
}
