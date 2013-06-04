/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.equals;

public class A {

    public int i;

    public boolean equals(A obj) {
        return ((obj != null)
                && (getClass() == obj.getClass())
                && (i == ((A) obj).i));
    }

    public int hashCode() {
        return i;
    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.i = 5;

        A a2 = new A();
        a2.i = 5;

        Object o = a2;

        System.out.println("a1.equals(a2): " + a1.equals(a2));
        System.out.println("a1.equals(o):  " + a1.equals(o));
    }
}
