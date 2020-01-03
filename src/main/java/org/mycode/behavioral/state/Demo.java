package org.mycode.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        Star star = new Star(new Nebula());
        for (int i = 0; i < 10; i++) {
            star.live();
            star.changeState();
        }
    }
}
