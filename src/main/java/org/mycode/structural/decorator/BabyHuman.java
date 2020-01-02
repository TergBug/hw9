package org.mycode.structural.decorator;

public class BabyHuman extends Human {
    public BabyHuman(String name) {
        super(name);
    }
    @Override
    public String born() {
        return name+" has been born\n";
    }
    @Override
    public String dead() {
        return name+" has been dead\n";
    }
}
