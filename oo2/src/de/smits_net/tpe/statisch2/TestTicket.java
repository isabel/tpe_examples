/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.statisch2;

public class TestTicket {
    public static void main(String[] args) {

        Ticket t1 = new Ticket("Dortmund-Schalke");
        System.out.println(Ticket.getZaehler());

        Ticket t2 = new Ticket("Hoffenheim-Leverkusen");
        System.out.println(Ticket.getZaehler());
    }
}
