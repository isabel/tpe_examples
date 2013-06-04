/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.ohnegenerics;

public class Verwender {

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(10);

        stack.push("Hello");
        String s = (String) stack.pop();
        System.out.println(s);

        stack.push(42);
        s = (String) stack.pop();
        System.out.println(s);
    }
}
