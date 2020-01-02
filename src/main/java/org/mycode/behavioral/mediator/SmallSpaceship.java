package org.mycode.behavioral.mediator;

public class SmallSpaceship extends Spaceship {
    public SmallSpaceship(Dock dock) {
        super(dock);
        this.numberOfConnects = 3;
    }
    @Override
    void sendRequestToConnect() {
        if (numberOfConnects > 0) {
            System.out.println("Small spaceship is connecting...");
            dock.connectSpaceships();
        } else {
            System.out.println("Small spaceship does not have free docks");
        }
    }
}
