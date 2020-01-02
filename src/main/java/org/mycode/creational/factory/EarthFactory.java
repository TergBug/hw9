package org.mycode.creational.factory;

public class EarthFactory implements PlanetFactory {
    @Override
    public Planet createPlanet() {
        return new Earth();
    }
}
