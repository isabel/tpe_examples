/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.wildcard;

public class StackPrinter {

    public void printStack(SimpleStack<?> stack) {

        for (int i = stack.getSize(); i >= 0; i--) {
            System.out.printf("%d %s%n", i, stack.pop());
        }
    }
}
