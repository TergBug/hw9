package org.mycode.behavioral.strategy;

public class Snowy implements Weather {
    @Override
    public void goAction() {
        System.out.println("It`s snowy");
    }
}
