package org.mycode.creational.abstractfactory.solar;

import org.mycode.creational.abstractfactory.AsteroidField;
import org.mycode.creational.abstractfactory.Planet;

public class SolarSystemAsteroidField implements AsteroidField {
    private String name;
    public SolarSystemAsteroidField(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void attackOnPlanet(Planet planet) {
        System.out.println(this.name+" attack on "+planet);
    }
}
