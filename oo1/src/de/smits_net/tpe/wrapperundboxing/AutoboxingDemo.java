/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.wrapperundboxing;

public class AutoboxingDemo {
    public static void main(String[] args) {

        Integer k = 5;
        int j = k;

        Object o = true;
        boolean b = new Boolean(true);

        Long l = 0L;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            l += i;
        }
    }
}
