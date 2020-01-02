package org.mycode.behavioral.chainofresponsibility;

public class ThirdLine extends LineOfProtection {
    public ThirdLine(int power) {
        super(power);
    }
    @Override
    public void win() {
        System.out.println("Third line win enemy");
    }
    @Override
    public void lose() {
        System.out.println("Third line lose enemy");
    }
}
