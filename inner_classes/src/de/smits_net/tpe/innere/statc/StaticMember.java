/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.innere.statc;

public class StaticMember {

    public static class InnereKlasse {

        @Override
        public String toString() {
            return "Ich bin innen";
        }
    }

    @Override
    public String toString() {
        return "Ich bin außen";
    }

    public static void main(String[] args) {
        StaticMember aeussere = new StaticMember();
        StaticMember.InnereKlasse innere = new StaticMember.InnereKlasse();
        System.out.println(aeussere); // -> "Ich bin außen"
        System.out.println(innere);   // -> "Ich bin innen"
    }
}
