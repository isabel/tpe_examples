/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inheritance;

import de.smits_net.tpe.mitgenerics.SimpleStack;

public class MyStack<T> extends SimpleStack<T> {

    public MyStack(int size) {
        super(size);
    }

    public T peek() {
        T wert = pop();
        push(wert);
        return wert;
    }
}
