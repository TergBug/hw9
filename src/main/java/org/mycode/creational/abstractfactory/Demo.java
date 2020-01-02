package org.mycode.creational.abstractfactory;

import org.mycode.creational.abstractfactory.sirius.SiriusSystemFactory;
import org.mycode.creational.abstractfactory.solar.SolarSystemFactory;
import org.mycode.creational.abstractfactory.solar.SolarSystemPlanet;

public class Demo {
    public static void main(String[] args) {
        showSolarSystem();
        showSiriusSystem();
    }
    private static void showSolarSystem(){
        StarSystemFactory starSystemFactory = new SolarSystemFactory();
        Star sun = starSystemFactory.createStar();
        sun.born();
        Planet[] planets = new Planet[4];
        for (int i = 0; i < planets.length; i++) {
            planets[i] = starSystemFactory.createPlanet();
            planets[i].born();
            planets[i].spinAroundItself();
            planets[i].spinAroundStar();
        }
        AsteroidField asteroidField = starSystemFactory.createAsteroidField();
        try {
            Thread.sleep(10000);
            for (Planet planet : planets) {
                System.out.println(((SolarSystemPlanet)planet).getName()+" years: "+((SolarSystemPlanet)planet).getCountSpinStar());
                System.out.println(((SolarSystemPlanet)planet).getName()+" days: "+((SolarSystemPlanet)planet).getCountSpinItself());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        asteroidField.attackOnPlanet(planets[3]);
        planets[3].explode();
        asteroidField.attackOnPlanet(planets[2]);
        planets[2].explode();
        sun.supernova();
        planets[0].explode();
        planets[1].explode();
    }
    private static void showSiriusSystem(){
        StarSystemFactory starSystemFactory = new SiriusSystemFactory();
        Star siriusA = starSystemFactory.createStar();
        Star siriusB = starSystemFactory.createStar();
        siriusA.born();
        siriusB.born();
        siriusA.supernova();
        siriusB.supernova();
    }
}
