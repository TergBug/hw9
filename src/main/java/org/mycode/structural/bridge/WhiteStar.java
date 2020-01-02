package org.mycode.structural.bridge;

public class WhiteStar implements Star {
    @Override
    public void born() {
        System.out.println("White star has been born");
    }
    @Override
    public String getColor() {
        return "white";
    }
    @Override
    public void supernova() {
        System.out.println("White star explode to supernova");
    }
}
