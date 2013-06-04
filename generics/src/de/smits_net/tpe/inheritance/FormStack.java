/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inheritance;

import de.smits_net.tpe.boundwildcard.Form;
import de.smits_net.tpe.mitgenerics.SimpleStack;

public class FormStack extends SimpleStack<Form> {

    public FormStack(int size) {
        super(size);
    }

    public Form peek() {
        Form wert = pop();
        push(wert);
        return wert;
    }
}
