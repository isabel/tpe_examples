/* (c) 2013 Thomas Smits */
package de.smits_net.tpe.clone;

/**
 *
 *
 * @author Thomas Smits
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Schaf dolly = new Schaf("Dolly");
        Schaf shawn = new Schaf("Shawn");
        dolly.setFreund(shawn);
        shawn.setFreund(dolly);


        Schaf dolly2 = (Schaf) dolly.clone();
        dolly2.ohrmarkennummer = 42;

        System.out.println(dolly);
        System.out.println("Ist befreundet mit " + dolly.getFreund());
        System.out.println("Cloning in Progress... all your sheep belong to us");
        System.out.println(dolly2);
        System.out.println("Ist befreundet mit " + dolly2.getFreund());


    }
}
