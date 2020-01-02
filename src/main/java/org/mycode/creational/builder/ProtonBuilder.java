package org.mycode.creational.builder;

public class ProtonBuilder extends ParticleBuilder {
    @Override
    public ParticleBuilder setName() {
        name = "Proton";
        return this;
    }
    @Override
    public ParticleBuilder setSpeed() {
        speed = 100560;
        return this;
    }
    @Override
    public ParticleBuilder setMass() {
        mass = 1;
        return this;
    }
    @Override
    public ParticleBuilder setCharge() {
        charge = 1;
        return this;
    }
    @Override
    public ParticleBuilder setSpin() {
        spin = 0.5;
        return this;
    }
}
