/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner6;

public class A$B {
    private int i;
    private int j;

    private void methodB(String s) {
        i = A.access$0(this$0) + A.access$1(this$0) + j;  // i = A.this.i + A.this.j + j;
        A.access$2(this$0, "Welt"); // methodA("Welt");
    }

    public A$B(A a) {
        this$0 = a;
    }

    final A this$0;
    static void access$0(A$B b, int i) { b.i = i; }
    static void access$1(A$B b, String s) { b.methodB(s); }
    static int access$2(A$B b) { return b.i; }
    static int access$3(A$B b) { return b.j; }
}
