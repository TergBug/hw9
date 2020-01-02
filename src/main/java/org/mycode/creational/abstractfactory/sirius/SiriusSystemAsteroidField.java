package org.mycode.creational.abstractfactory.sirius;

import org.mycode.creational.abstractfactory.AsteroidField;
import org.mycode.creational.abstractfactory.Planet;

public class SiriusSystemAsteroidField implements AsteroidField {
    @Override
    public void attackOnPlanet(Planet planet) {
        System.out.println("Unknown asteroid field attack on "+planet);
    }
}
