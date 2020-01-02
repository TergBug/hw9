package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class IrrationalNumberSet extends NumberSet {
    public IrrationalNumberSet() {
        super("Irrational");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(Math.PI, 0);
    }
}
