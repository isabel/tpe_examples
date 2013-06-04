/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.ohnegenerics;

public class SimpleStackInteger {

    private Integer[] stack;
    private int pos;

    public SimpleStackInteger(int size) {
        stack = new Integer[size];
        pos = 0;
    }

    public void push(Integer o) {
        stack[pos++] = o;
    }

    public Integer pop() {
       return stack[--pos];
    }
}
