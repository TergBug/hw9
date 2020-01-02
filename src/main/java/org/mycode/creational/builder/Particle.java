package org.mycode.creational.builder;

public class Particle {
    private String name;
    private int speed;
    private double mass;
    private int charge;
    private double spin;
    public Particle(String name, int speed, double mass, int charge, double spin) {
        this.name = name;
        this.speed = speed;
        this.mass = mass;
        this.charge = charge;
        this.spin = spin;
    }
    @Override
    public String toString() {
        return "Particle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", mass=" + mass +
                ", charge=" + charge +
                ", spin=" + spin +
                '}';
    }
}
