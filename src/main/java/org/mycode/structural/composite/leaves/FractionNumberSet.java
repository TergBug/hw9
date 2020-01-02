package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class FractionNumberSet extends NumberSet {
    public FractionNumberSet() {
        super("Fraction");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(0.54321, 0);
    }
}
