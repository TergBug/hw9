package org.mycode.behavioral.state;

public class PlanetarySystem implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("There is a planetary system around the star");
    }
}
