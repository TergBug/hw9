package org.mycode.behavioral.mediator;

public class BigSpaceship extends Spaceship {
    public BigSpaceship(Dock dock) {
        super(dock);
        this.numberOfConnects = 10;
    }
    @Override
    void sendRequestToConnect() {
        if(numberOfConnects>0){
            System.out.println("Big spaceship is connecting...");
            dock.connectSpaceships();
        } else {
            System.out.println("Big spaceship does not have free docks");
        }
    }
}
