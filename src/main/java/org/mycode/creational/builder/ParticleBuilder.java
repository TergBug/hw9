package org.mycode.creational.builder;

public abstract class ParticleBuilder {
    protected String name;
    protected int speed;
    protected double mass;
    protected int charge;
    protected double spin;
    public abstract ParticleBuilder setName();
    public abstract ParticleBuilder setSpeed();
    public abstract ParticleBuilder setMass();
    public abstract ParticleBuilder setCharge();
    public abstract ParticleBuilder setSpin();
    public Particle build(){
        return new Particle(name, speed, mass, charge, spin);
    }
}
