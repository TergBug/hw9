package org.mycode.behavioral.visitor;

public class Sirius implements Star {
    @Override
    public void lightOnPlanet(Mercury mercury) {
        System.out.println("Sirius isn`t lighting on Mercury");
    }
    @Override
    public void lightOnPlanet(Venus venus) {
        System.out.println("Sirius isn`t lighting on Venus");
    }
    @Override
    public void lightOnPlanet(Earth earth) {
        System.out.println("Sirius isn`t lighting on Earth");
    }
    @Override
    public void lightOnPlanet(Mars mars) {
        System.out.println("Sirius isn`t lighting on Mars");
    }
}
