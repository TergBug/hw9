package org.mycode.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        Human human = new RunnableHuman(new SpeakableHuman(new BabyHuman("Jack")));
        System.out.println(human.born()+human.dead());
    }
}
