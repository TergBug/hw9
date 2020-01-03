package org.mycode.behavioral.state;

import java.util.Random;

public class Star {
    private StateOfStar stateOfStar;
    public Star(StateOfStar stateOfStar) {
        this.stateOfStar = stateOfStar;
    }
    public void changeState(){
        if (stateOfStar instanceof Nebula){
            stateOfStar = new AccretionDisk();
        } else if (stateOfStar instanceof AccretionDisk){
            stateOfStar = new PlanetarySystem();
        } else if (stateOfStar instanceof PlanetarySystem){
            stateOfStar = new Supernova();
        } else if (stateOfStar instanceof Supernova){
            stateOfStar = (new Random().nextBoolean()) ? new WhiteDwarf() : new BlackHole();
        } else if (stateOfStar instanceof WhiteDwarf || stateOfStar instanceof BlackHole){
            stateOfStar = new Nebula();
        }
    }
    public void live(){
        stateOfStar.liveInState();
    }
}
