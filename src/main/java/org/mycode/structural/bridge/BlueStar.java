package org.mycode.structural.bridge;

public class BlueStar implements Star {
    @Override
    public void born() {
        System.out.println("Blue star has been born");
    }
    @Override
    public String getColor() {
        return "blue";
    }
    @Override
    public void supernova() {
        System.out.println("Blue star explode to supernova");
    }
}
