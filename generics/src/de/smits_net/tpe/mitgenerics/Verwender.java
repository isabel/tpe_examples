/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitgenerics;

public class Verwender {

    public static void main(String[] args) {
        SimpleStack<String> stack = new SimpleStack<String>(10);

        stack.push("Hello");
        String s = stack.pop();
        System.out.println(s);

//        stack.push(42);
        s = stack.pop();
        System.out.println(s);
    }
}
