/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro;

public class BrokenSimpleStack {

    private Object[] stack;
    private int pos;

    public BrokenSimpleStack(int size) {
        stack = new Object[size];
        pos = 0;
    }

    public synchronized void push(Object o) {
        stack[pos++] = o;
    }

    public synchronized Object pop() {
       return stack[--pos];
    }

    public Object peek() {
        return stack[pos - 1];
    }
}