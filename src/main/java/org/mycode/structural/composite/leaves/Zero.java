package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class Zero extends NumberSet {
    public Zero() {
        super("Zero");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(0, 0);
    }
}

