package org.mycode.creational.abstractfactory;

public interface StarSystemFactory {
    Star createStar();
    Planet createPlanet();
    AsteroidField createAsteroidField();
}
