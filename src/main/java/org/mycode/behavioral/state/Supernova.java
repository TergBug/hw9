package org.mycode.behavioral.state;

public class Supernova implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("Star explode to supernova");
    }
}
