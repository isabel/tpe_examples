/* (c) 2013 Thomas Smits */
package de.smits_net.tpe.clone;

import java.util.Random;

/**
 *
 *
 * @author Thomas Smits
 */
public class Schaf implements Cloneable {

    public static int schafCounter = 0;

    private String name;
    private Schaf freund;
    public int ohrmarkennummer = new Random().nextInt(10000);

    public Schaf(String name) {
        this.name = name;
        System.out.printf("Konstruktor gerufen für Schaf %s%n", name);
    }

    public void setFreund(Schaf freund) {
        this.freund = freund;
    }

    public Schaf getFreund() {
        return freund;
    }

    @Override
    public String toString() {
        return String.format("Ich heisse %s (Nummer %d, code %d), " +
        		"mein Freund heisst %s",
                name, ohrmarkennummer, System.identityHashCode(this),
                freund != null ? freund.name : "Du hast keine Freunde!!!!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        schafCounter++;
        System.out.println(schafCounter);
        Schaf miniMi = (Schaf) super.clone();
        miniMi.freund = ((freund == null) ? null : (Schaf) freund.clone());
        return miniMi;
    }
}






