package org.mycode.behavioral.chainofresponsibility;

public class SecondLine extends LineOfProtection {
    public SecondLine(int power) {
        super(power);
    }
    @Override
    public void win() {
        System.out.println("Second line win enemy");
    }
    @Override
    public void lose() {
        System.out.println("Second line lose enemy");
    }
}
