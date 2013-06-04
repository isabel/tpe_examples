/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Twister {

    private final String name;

    Twister(String name) { this.name = name; }

    private String name() { return name; }

    private void reproduce() {
        new Twister("reproduce") {
            void printName() {
                System.out.println(name());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Twister("main").reproduce();
    }
}
