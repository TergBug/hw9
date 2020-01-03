package org.mycode.behavioral.state;

public class Nebula implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("There is no star yet, just simple nebula");
    }
}
