/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitgenerics;

public class SimpleStack<T> {

    private T[] stack;
    private int pos;

    @SuppressWarnings("unchecked")
    public SimpleStack(int size) {
        stack = (T[]) new Object[size];
        pos = 0;
    }

    public void push(T o) {
        stack[pos++] = o;
    }

    public T pop() {
       return stack[--pos];
    }
}
