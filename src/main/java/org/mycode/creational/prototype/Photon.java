package org.mycode.creational.prototype;

public class Photon implements Prototype{
    private int speed;
    private int mass;
    private int charge;
    private double spin;
    public Photon(int speed, int mass, int charge, double spin) {
        this.speed = speed;
        this.mass = mass;
        this.charge = charge;
        this.spin = spin;
    }
    @Override
    public Prototype getPrototype() {
        return new Photon(speed, mass, charge, spin);
    }
    @Override
    public String toString() {
        return "Photon{" +
                "speed=" + speed +
                ", mass=" + mass +
                ", charge=" + charge +
                ", spin=" + spin +
                '}';
    }
}
