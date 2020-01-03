package org.mycode.behavioral.strategy;

public class Sunny implements Weather {
    @Override
    public void goAction() {
        System.out.println("It`s sunny");
    }
}
