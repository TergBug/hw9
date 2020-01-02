package org.mycode.structural.decorator;

public abstract class Human {
    protected String name;
    protected Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    protected abstract String born();
    protected abstract String dead();
}
