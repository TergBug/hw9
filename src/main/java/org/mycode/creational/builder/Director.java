package org.mycode.creational.builder;

public class Director {
    private ParticleBuilder particleBuilder;
    public Director(ParticleBuilder particleBuilder){
        this.particleBuilder = particleBuilder;
    }
    public void setParticleBuilder(ParticleBuilder particleBuilder) {
        this.particleBuilder = particleBuilder;
    }
    public Particle buildParticle(){
        return particleBuilder.setName()
                .setSpeed()
                .setMass()
                .setCharge()
                .setSpin()
                .build();
    }
}
