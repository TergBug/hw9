package org.mycode.behavioral.chainofresponsibility;

public class FirstLine extends LineOfProtection {
    public FirstLine(int power) {
        super(power);
    }
    @Override
    public void win() {
        System.out.println("First line win enemy");
    }
    @Override
    public void lose() {
        System.out.println("First line lose enemy");
    }
}
