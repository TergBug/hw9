package org.mycode.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Director particleDirector = new Director(new ElectronBuilder());
        Particle electron = particleDirector.buildParticle();
        particleDirector.setParticleBuilder(new ProtonBuilder());
        Particle proton = particleDirector.buildParticle();
        System.out.println(electron);
        System.out.println(proton);
    }
}
