package org.mycode.structural.composite.trunks;

import org.mycode.structural.composite.CompositeNumberSet;
import org.mycode.structural.composite.Num;

public class ComplexNumberSet extends CompositeNumberSet {
    public ComplexNumberSet() {
        super("Complex");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(5, 5);
    }
}
