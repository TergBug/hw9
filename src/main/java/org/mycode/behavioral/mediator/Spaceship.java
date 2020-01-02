package org.mycode.behavioral.mediator;

public abstract class Spaceship {
    protected Dock dock;
    protected int numberOfConnects;
    protected Spaceship(Dock dock) {
        this.dock = dock;
    }
    public int getNumberOfConnects() {
        return numberOfConnects;
    }
    public void setNumberOfConnects(int numberOfConnects) {
        this.numberOfConnects = numberOfConnects;
    }
    abstract void sendRequestToConnect();
}
