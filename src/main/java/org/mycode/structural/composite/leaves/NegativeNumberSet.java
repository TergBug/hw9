package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class NegativeNumberSet extends NumberSet {
    public NegativeNumberSet() {
        super("Negative");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(-3, 0);
    }
}
