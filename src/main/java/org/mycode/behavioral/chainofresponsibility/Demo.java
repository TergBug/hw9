package org.mycode.behavioral.chainofresponsibility;

public class Demo {
    public static void main(String[] args) {
        LineOfProtection firstLine = new FirstLine(5);
        LineOfProtection secondLine = new SecondLine(7);
        LineOfProtection thirdLine = new ThirdLine(9);
        firstLine.setNextLine(secondLine);
        secondLine.setNextLine(thirdLine);

        firstLine.protect(6);
        firstLine.protect(10);
    }
}
