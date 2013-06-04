/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.boxing;

public class BoxingQuiz {

    public static void main(String[] args) {
        Long l1 = 150L;
        Long l2 = 200L;

        l2 = l2 - 50;

        System.out.println(l1 == l2);
    }
}
