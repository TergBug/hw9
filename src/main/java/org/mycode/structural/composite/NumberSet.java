package org.mycode.structural.composite;

public abstract class NumberSet {
    protected String name;
    protected NumberSet(String name) {
        this.name = name;
    }
    public boolean add(NumberSet numberSet){
        return false;
    }
    public String getForEachName(){
        return name;
    }
    protected abstract Num getSimpleInstance();
}
