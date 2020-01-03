package org.mycode.behavioral.strategy;

public class Rainy implements Weather {
    @Override
    public void goAction() {
        System.out.println("It`s rainy");
    }
}
