package org.mycode.structural.composite;

import org.mycode.structural.composite.leaves.*;
import org.mycode.structural.composite.trunks.*;

public class Demo {
    public static void main(String[] args) {
        NumberSet integerNumberSet = new IntegerNumberSet();
        integerNumberSet.add(new NegativeNumberSet());
        integerNumberSet.add(new NaturalNumberSet());
        integerNumberSet.add(new Zero());

        NumberSet rationalNumberSet = new RationalNumberSet();
        rationalNumberSet.add(new FractionNumberSet());
        rationalNumberSet.add(integerNumberSet);

        NumberSet realNumberSet = new RealNumberSet();
        realNumberSet.add(new IrrationalNumberSet());
        realNumberSet.add(rationalNumberSet);

        NumberSet complexNumberSet = new ComplexNumberSet();
        complexNumberSet.add(new ImaginaryNumberSet());
        complexNumberSet.add(realNumberSet);

        System.out.println(complexNumberSet.getForEachName());
        System.out.println("Simple complex number: "+complexNumberSet.getSimpleInstance());
    }
}
