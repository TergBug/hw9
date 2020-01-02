package org.mycode.structural.decorator;

public class HumanDecorator extends Human{
    private Human human;
    protected HumanDecorator(Human human) {
        super(human.getName());
        this.human = human;
    }
    @Override
    protected String born() {
        return human.born();
    }
    @Override
    protected String dead() {
        return human.dead();
    }
}
