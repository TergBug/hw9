package org.mycode.creational.builder;

public class ElectronBuilder extends ParticleBuilder {
    @Override
    public ParticleBuilder setName() {
        name = "Electron";
        return this;
    }
    @Override
    public ParticleBuilder setSpeed() {
        speed = 200000;
        return this;
    }
    @Override
    public ParticleBuilder setMass() {
        mass = 0.0005;
        return this;
    }
    @Override
    public ParticleBuilder setCharge() {
        charge = -1;
        return this;
    }
    @Override
    public ParticleBuilder setSpin() {
        spin = 0.5;
        return this;
    }
}
