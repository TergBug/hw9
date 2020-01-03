package org.mycode.behavioral.strategy;

public class Foggy implements Weather {
    @Override
    public void goAction() {
        System.out.println("It`s foggy");
    }
}
