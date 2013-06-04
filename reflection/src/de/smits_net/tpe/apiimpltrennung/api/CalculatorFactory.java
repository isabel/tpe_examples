/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.apiimpltrennung.api;

public class CalculatorFactory {

    private static final String IMPL_CLASS =
        "de.smits_net.tpe.apiimpltrennung.impl.CalculatorImpl";

    private CalculatorFactory() {}

    public static Calculator createCalculator() {
        Class<?> clazz;
        try {
            clazz = Class.forName(IMPL_CLASS);
            return (Calculator) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(IMPL_CLASS + " nicht gefunden");
        } catch (InstantiationException e) {
            throw new IllegalStateException(IMPL_CLASS + " hat einen Fehler geworfen: " + e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(IMPL_CLASS + " hat keinen public Konstruktor");
        }
    }
}
