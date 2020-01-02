package org.mycode.structural.decorator;

public class RunnableHuman extends HumanDecorator {
    public RunnableHuman(Human human) {
        super(human);
    }
    public String run(){
        return name+" runs\n";
    }
    @Override
    public String born() {
        return super.born()+run();
    }
}
