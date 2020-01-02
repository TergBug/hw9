package org.mycode.structural.composite.trunks;

import org.mycode.structural.composite.CompositeNumberSet;
import org.mycode.structural.composite.Num;

public class IntegerNumberSet extends CompositeNumberSet {
    public IntegerNumberSet() {
        super("Integer");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(7, 0);
    }
}
