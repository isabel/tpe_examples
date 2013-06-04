/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.binding;

class A {
}

class B extends A {
}

public class BindingQuiz {

    public static void f(A a) {
        System.out.println("A");
    }

    public static void f(B b) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();

        f(a1);
        f(a2);
        f(b);
    }
}
