package org.mycode.behavioral.state;

public class AccretionDisk implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("There is a protoplanetary accretion disk with a star in the center");
    }
}
