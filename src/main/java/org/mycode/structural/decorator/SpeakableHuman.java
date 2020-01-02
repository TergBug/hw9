package org.mycode.structural.decorator;

public class SpeakableHuman extends HumanDecorator{
    public SpeakableHuman(Human human) {
        super(human);
    }
    public String speak(){
        return name+" speaks\n";
    }
    @Override
    public String born() {
        return super.born()+speak();
    }
}
