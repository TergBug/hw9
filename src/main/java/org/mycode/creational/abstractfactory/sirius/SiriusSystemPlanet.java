package org.mycode.creational.abstractfactory.sirius;

import org.mycode.creational.abstractfactory.Planet;

public class SiriusSystemPlanet implements Planet {
    @Override
    public void born() {
        System.out.println("New planet has been born");
    }
    @Override
    public void spinAroundItself() {
        System.out.println("Unknown planet is spinning around itself");
    }
    @Override
    public void spinAroundStar() {
        System.out.println("Unknown planet is spinning around Sirius");
    }
    @Override
    public void explode() {
        System.out.println("Unknown planet explode");
    }
    @Override
    public String toString() {
        return "unknown planet";
    }
}
