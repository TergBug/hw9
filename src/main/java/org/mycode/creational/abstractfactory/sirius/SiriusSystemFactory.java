package org.mycode.creational.abstractfactory.sirius;

import org.mycode.creational.abstractfactory.AsteroidField;
import org.mycode.creational.abstractfactory.Planet;
import org.mycode.creational.abstractfactory.Star;
import org.mycode.creational.abstractfactory.StarSystemFactory;

public class SiriusSystemFactory implements StarSystemFactory {
    private int counterOfStars = 0;
    @Override
    public Star createStar() {
        switch ((counterOfStars>1) ? (counterOfStars=0) : counterOfStars++){
            case 0: return new Sirius("Sirius A");
            case 1: return new Sirius("Sirius B");
            default: return new Sirius("");
        }
    }
    @Override
    public Planet createPlanet() {
        return new SiriusSystemPlanet();
    }
    @Override
    public AsteroidField createAsteroidField() {
        return new SiriusSystemAsteroidField();
    }
}
