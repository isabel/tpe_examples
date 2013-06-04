/* (c) 2011 Thomas Smits */
package de.smits_net.tpe;

import java.util.Scanner;

/**
 *
 *
 * @author Thomas Smits
 */
public class IsPrim {

    public static void main(String[] args) {
        int r, i = 2, n = new Scanner(System.in).nextInt();
        while ((r = (n % i)) != 0 & (i++ < Math.sqrt(n)));
        System.out.println(r == 0 ? "Keine Primzahl (" + --i +")" : "Primzahl");
    }

    //for (int i = 2; (r = (n % i)) != 0 && (i < Math.sqrt(n)); i++);

}
