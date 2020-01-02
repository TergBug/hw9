package org.mycode.behavioral.mediator;

public class Demo {
    public static void main(String[] args) {
        CircleDock dock = new CircleDock();
        Spaceship bigSpaceship = new BigSpaceship(dock);
        Spaceship smallSpaceship = new SmallSpaceship(dock);
        dock.setSpaceship1(bigSpaceship);
        dock.setSpaceship2(smallSpaceship);
        bigSpaceship.sendRequestToConnect();
        bigSpaceship.sendRequestToConnect();
        bigSpaceship.sendRequestToConnect();
        bigSpaceship.sendRequestToConnect();
    }
}
