package org.mycode.creational.factory;

public class MarsFactory implements PlanetFactory {
    @Override
    public Planet createPlanet() {
        return new Mars();
    }
}
