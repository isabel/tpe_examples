/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitvererbung;

public class Outer {

    protected String s;
    private String t;

    protected void methode() {
        System.out.println("Outer:methode()");
    }

    public class Inner extends Outer {

        protected void methode() {
            System.out.println("Inner:methode()");
        }

        public void doIt() {
            s = "geerbter String";
            Outer.this.s = "String von außen";
            t = "nicht über Vererbung sichtbar";
            Outer.this.methode();
            methode();
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.doIt();
        System.out.println(o.s);
        System.out.println(i.s);
    }
}