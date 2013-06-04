/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

public class GanzBoese {

    public static void printArray(int[] array) {

        try {
            for (int i = 0;;i++) {
                System.out.println(array[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
        }
    }

    public static void main(String[] args) {
        printArray(new int[] { 1,2,3,4,5,6,7,8,9,10 });
    }
}
