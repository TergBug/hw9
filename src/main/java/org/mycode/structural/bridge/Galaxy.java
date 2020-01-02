package org.mycode.structural.bridge;

public abstract class Galaxy {
    protected Star mostStar;
    protected Galaxy(Star mostStar){
        this.mostStar = mostStar;
    }
    abstract void mostTypeOfStars();
}
