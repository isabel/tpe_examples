/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.maps;

import java.util.Date;

public class Mitarbeiter {

    public String name;
    public double gehalt;
    public Date geburtsdatum;

    public Mitarbeiter(String name, double gehalt, Date geburtsdatum) {
        super();
        this.name = name;
        this.gehalt = gehalt;
        this.geburtsdatum = geburtsdatum;
    }

    public Mitarbeiter(String name, double gehalt) {
        super();
        this.name = name;
        this.gehalt = gehalt;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }
        else if (o == this) {
            return true;
        }
        else if (o instanceof Mitarbeiter) {
            Mitarbeiter mi = (Mitarbeiter) o;

            return mi.name.equals(name)
                    && mi.gehalt == gehalt
                    && mi.geburtsdatum.equals(geburtsdatum);
        }
        else {
            return false;
        }
    }

    public int hashCode() {
        return name.hashCode()
            ^ (int) Double.doubleToLongBits(gehalt)
            ^ geburtsdatum.hashCode();
    }

    public void doIt(Mitarbeiter m) {
        System.out.println(m + " hat ein Gehalt von " + gehalt);
        System.out.println(m.toString() + " hat ein Gehalt von " + Double.toString(gehalt));
    }

    public String toString() {
        return "Mitarbeiter [name: " + name + ", "
                + "gehalt: " + gehalt + ", "
                + "geburtsdatum " + geburtsdatum + "]";
    }

    public static void main(String[] args) {
        Mitarbeiter m = new Mitarbeiter("Franz Meier", 5000.00, new Date(new Date().getTime() - 1000L*1000*1000*1000));
        m.doIt(m);
    }
}
