package org.mycode.behavioral.strategy;

public class Storm implements Weather {
    @Override
    public void goAction() {
        System.out.println("It`s storm");
    }
}
