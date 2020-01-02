package org.mycode.creational.abstractfactory.solar;

import org.mycode.creational.abstractfactory.AsteroidField;
import org.mycode.creational.abstractfactory.Planet;
import org.mycode.creational.abstractfactory.Star;
import org.mycode.creational.abstractfactory.StarSystemFactory;

public class SolarSystemFactory implements StarSystemFactory {
    private int counterOfPlaners = 0;
    private int counterOfAsteroidFields = 0;
    @Override
    public Star createStar() {
        return new Sun();
    }
    @Override
    public Planet createPlanet() {
        switch ((counterOfPlaners>7) ? (counterOfPlaners=0) : counterOfPlaners++){
            case 0: return new SolarSystemPlanet("Mercury", 5, 40, 0);
            case 1: return new SolarSystemPlanet("Venus", 81, 70, 0);
            case 2: return new SolarSystemPlanet("Earth", 100, 100, 1);
            case 3: return new SolarSystemPlanet("Mars", 10, 150, 2);
            case 4: return new SolarSystemPlanet("Jupiter", 31800, 520, 79);
            case 5: return new SolarSystemPlanet("Saturn", 9500, 950, 82);
            case 6: return new SolarSystemPlanet("Uranus", 1400, 1920, 27);
            case 7: return new SolarSystemPlanet("Neptune", 1700, 3010, 14);
            default: return new SolarSystemPlanet("", 0, 0, 0);
        }
    }
    @Override
    public AsteroidField createAsteroidField() {
        switch ((counterOfAsteroidFields>2) ? (counterOfAsteroidFields=0) : counterOfAsteroidFields++){
            case 0: return new SolarSystemAsteroidField("Asteroid belt");
            case 1: return new SolarSystemAsteroidField("Kuiper belt");
            case 2: return new SolarSystemAsteroidField("Oort cloud");
            default: return new SolarSystemAsteroidField("");
        }
    }
}
