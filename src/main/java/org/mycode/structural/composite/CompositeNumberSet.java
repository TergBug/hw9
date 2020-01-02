package org.mycode.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeNumberSet extends NumberSet {
    protected List<NumberSet> numberSetList;
    protected CompositeNumberSet(String name) {
        super(name);
        numberSetList = new ArrayList<>();
    }
    @Override
    public boolean add(NumberSet numberSet) {
        return numberSetList.add(numberSet);
    }
    @Override
    public String getForEachName() {
        StringBuilder forEachName = new StringBuilder(name + "{ ");
        for (NumberSet numSet : numberSetList) {
            forEachName.append(numSet.getForEachName()).append(" ");
        }
        forEachName.append("}");
        return forEachName.toString();
    }
}
