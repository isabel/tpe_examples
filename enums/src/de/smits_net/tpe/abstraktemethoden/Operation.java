/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstraktemethoden;

public enum Operation {

    ADDITION {
        public double anwenden(double op1, double op2) {
            return op1 + op2;
        }
    },
    SUBTRAKTION {
        public double anwenden(double op1, double op2) {
            return op1 - op2;
        }
    },
    MULTIPLIKATION {
        public double anwenden(double op1, double op2) {
            return op1 * op2;
        }
    },
    DIVISION {
        public double anwenden(double op1, double op2) {
            return op1 / op2;
        }
    };

    public abstract double anwenden(double op1, double op2);
}
