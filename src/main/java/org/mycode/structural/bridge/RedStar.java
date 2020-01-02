package org.mycode.structural.bridge;

public abstract class RedStar implements Star {
    @Override
    public void born() {
        System.out.println("Red star has been born");
    }
    @Override
    public String getColor() {
        return "red";
    }
    @Override
    public void supernova() {
        System.out.println("Red star explode to supernova");
    }
}
