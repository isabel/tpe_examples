/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

public class Pair<T, V> {

    private T o1;
    private V o2;

    public Pair(T o1, V o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T getFirst() {
        return o1;
    }

    public V getSecond() {
        return o2;
    }
}
