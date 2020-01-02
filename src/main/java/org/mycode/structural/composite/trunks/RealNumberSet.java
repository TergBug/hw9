package org.mycode.structural.composite.trunks;

import org.mycode.structural.composite.CompositeNumberSet;
import org.mycode.structural.composite.Num;

public class RealNumberSet extends CompositeNumberSet {
    public RealNumberSet() {
        super("Real");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(5, 0);
    }
}
