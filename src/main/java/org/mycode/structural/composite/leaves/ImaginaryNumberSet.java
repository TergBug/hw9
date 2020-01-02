package org.mycode.structural.composite.leaves;

import org.mycode.structural.composite.Num;
import org.mycode.structural.composite.NumberSet;

public class ImaginaryNumberSet extends NumberSet {
    public ImaginaryNumberSet() {
        super("Imaginary");
    }
    @Override
    public Num getSimpleInstance() {
        return new Num(0, 5);
    }
}
