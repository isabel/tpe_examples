/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.synchro.thi;

public class SimpleStack {

    private Object[] stack;
    private int pos;

    public SimpleStack(int size) {
        stack = new Object[size];
        pos = 0;
    }

    public void push(Object o) {
        synchronized (this) {
            stack[pos++] = o;
        }
    }

    public Object pop() {
       synchronized (this) {
           return stack[--pos];
       }
    }
}