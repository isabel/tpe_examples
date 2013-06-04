/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.intern;

public class InternDemo {
    public static void main(String[] args) {
        String s1 = "Hallo";
        String s2 = "Hallo";
        String s3 = new String("Hallo");
        String s4 = s3.intern();

        System.out.println(s1 == s2);  // -> true
        System.out.println(s1 == s3);  // -> false
        System.out.println(s1 == s4);  // -> true

        String s = "";

        if ((s != null) && (s.equals("text"))) {}
        if ("text".equals(s)) {}
    }
}
