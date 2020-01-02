package org.mycode.structural.composite.trunks;

import org.mycode.structural.composite.CompositeNumberSet;
import org.mycode.structural.composite.Num;

public class RationalNumberSet extends CompositeNumberSet {
    public RationalNumberSet() {
        super("Rational");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(7.549, 0);
    }
}
