/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung1;

import java.util.Date;

public class GeschaeftsfuehrerBean extends Manager {

    private boolean prokura = true;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGehalt() {
        return gehalt;
    }
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
    public Date getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
    public boolean isProkura() {
        return prokura;
    }
    public void setProkura(boolean prokura) {
        this.prokura = prokura;
    }
}
