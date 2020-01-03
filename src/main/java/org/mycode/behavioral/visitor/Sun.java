package org.mycode.behavioral.visitor;

public class Sun implements Star {
    @Override
    public void lightOnPlanet(Mercury mercury) {
        System.out.println("Sun is lighting on Mercury");
    }
    @Override
    public void lightOnPlanet(Venus venus) {
        System.out.println("Sun is lighting on Venus");
    }
    @Override
    public void lightOnPlanet(Earth earth) {
        System.out.println("Sun is lighting on Earth");
    }
    @Override
    public void lightOnPlanet(Mars mars) {
        System.out.println("Sun is lighting on Mars");
    }
}
