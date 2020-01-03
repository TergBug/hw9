package org.mycode.behavioral.state;

public class WhiteDwarf implements StateOfStar {
    @Override
    public void liveInState() {
        System.out.println("There is white dwarf after supernova");
    }
}
