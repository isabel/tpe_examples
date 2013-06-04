/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.quiz;

public class Swap {

    void swap(String s1, String s2) {
        String temp = s1;
        s1 = s2;
        s2 = temp;
    }

    void swapMe() {
        String s1 = "Hallo";
        String s2 = "Welt";
        swap(s1, s2);
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {
        new Swap().swapMe();
    }
}
