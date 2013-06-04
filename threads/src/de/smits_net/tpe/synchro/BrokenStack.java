/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro;

public class BrokenStack {

    private Object[] stack;
    private int pos;

    public BrokenStack(int size) {
        stack = new Object[size];
        pos = 0;
    }

    public synchronized void push(Object o) {
        stack[pos++] = o;
    }

    public synchronized Object pop() {
       return stack[--pos];
    }

    public synchronized void swap() {
        Object o1 = pop();
        Object o2 = pop();
        push(o1);
        push(o2);
    }
}