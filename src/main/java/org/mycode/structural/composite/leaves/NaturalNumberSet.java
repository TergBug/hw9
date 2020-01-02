package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class NaturalNumberSet extends NumberSet {
    public NaturalNumberSet() {
        super("Natural");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(3, 0);
    }
}