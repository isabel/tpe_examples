/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.methoden;

public class Verwender {

    public static void main(String[] args) {
        SimpleStack<String> stack1 = new SimpleStack<String>(10);
        stack1.push("Hello");
        stack1.push("World");

        SimpleStack<String> stack2 = new SimpleStack<String>(10);
        stack2.push("!");

        SimpleStack<String> ergebnis = Zusammenfasser2.fasseZusammen(stack1, stack2);
    }
}
