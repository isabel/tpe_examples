/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.constructor;

public class NameHolder {

    private String name;

    public void NameHolder() {
        name = "Hallo";
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        NameHolder s = new NameHolder();
        System.out.println(s);
    }
}
