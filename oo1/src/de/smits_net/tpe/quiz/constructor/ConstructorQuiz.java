/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.constructor;

class A {
    public A() { System.out.println("A"); }
}

class B extends A {
    public B() { System.out.println("B"); }
}

public class ConstructorQuiz {

    public static void main(String[] args) {
        new B();
    }
}
