/*
 * (c) 2009 Thomas Smits 
 */
package de.smits_net.tpe.statisch3;

public class Ticket {

    private static int zaehler;
    
    private int serienNummer;
    private String spiel;
    
    static {
        zaehler = Integer.parseInt(System.getProperty("zaehler_start"));
    }
    
    public Ticket(String spiel) {
        zaehler++;
        serienNummer = zaehler;
        this.spiel = spiel;
    }
    
    static {
        System.out.println("Ticket initialisiert: zaehler=" + zaehler);
    }
    
    public static int getZaehler() {
        return zaehler;
    }    
}

