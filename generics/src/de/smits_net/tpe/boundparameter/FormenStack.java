/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundparameter;

public class FormenStack<T extends Form> {

    private T[] stack;
    private int pos;

    @SuppressWarnings("unchecked")
    public FormenStack(int size) {
        stack = (T[]) new Form[size];
        pos = 0;
    }

    public void push(T o) {
        stack[pos++] = o;
    }

    public T pop() {
       return stack[--pos];
    }

    public int getSize() {
        return pos - 1;
    }

    public double flaeche() {

        double summe = 0;

        for (int i = getSize(); i >= 0; i--) {
            summe += pop().flaeche();
        }

        return summe;
    }
}
