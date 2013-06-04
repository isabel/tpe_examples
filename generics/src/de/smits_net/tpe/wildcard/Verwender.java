/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.wildcard;

public class Verwender {

    public static void main(String[] args) {
        SimpleStack<String> stack = new SimpleStack<String>(10);

        stack.push("!");
        stack.push("World");
        stack.push("Hello");

        StackPrinter printer = new StackPrinter();
        printer.printStack(stack);

        SimpleStack<?> wildcard1 = new SimpleStack<String>(10);
        // SimpleStack<?> wildcard2 = new SimpleStack<?>(10);
    }
}
