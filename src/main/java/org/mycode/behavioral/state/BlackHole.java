package org.mycode.behavioral.state;

public class BlackHole implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("There is black hole after supernova");
    }
}
