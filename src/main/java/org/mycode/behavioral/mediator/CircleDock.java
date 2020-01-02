package org.mycode.behavioral.mediator;

public class CircleDock implements Dock {
    private Spaceship spaceship1;
    private Spaceship spaceship2;
    public void setSpaceship1(Spaceship spaceship1) {
        this.spaceship1 = spaceship1;
    }
    public void setSpaceship2(Spaceship spaceship2) {
        this.spaceship2 = spaceship2;
    }
    @Override
    public void connectSpaceships() {
        if(spaceship1.getNumberOfConnects()<=0) {
            spaceship1.sendRequestToConnect();
        } else if(spaceship2.getNumberOfConnects()<=0) {
            spaceship2.sendRequestToConnect();
        } else {
            spaceship1.setNumberOfConnects(spaceship1.getNumberOfConnects()-1);
            spaceship2.setNumberOfConnects(spaceship2.getNumberOfConnects()-1);
        }
    }
}
