/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro.methods;

public class SimpleStack {

    private Object[] stack;
    private int pos;

    public SimpleStack(int size) {
        stack = new Object[size];
        pos = 0;
    }

    public synchronized void push(Object o) {
        stack[pos++] = o;
    }

    public synchronized Object pop() {
       return stack[--pos];
    }
}