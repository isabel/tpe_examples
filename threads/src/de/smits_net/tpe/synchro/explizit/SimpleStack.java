/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro.explizit;

public class SimpleStack {

    private Object[] stack;
    private int pos;
    private Object lock = new Object();

    public SimpleStack(int size) {
        stack = new Object[size];
        pos = 0;
    }

    public void push(Object o) {
        synchronized (lock) {
            stack[pos++] = o;
        }
    }

    public Object pop() {
       synchronized (lock) {
           return stack[--pos];
       }
    }
}