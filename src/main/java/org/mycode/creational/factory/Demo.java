package org.mycode.creational.factory;

public class Demo {
    public static void main(String[] args) {
        PlanetFactory planetFactory = new EarthFactory();
        Planet earth = planetFactory.createPlanet();
        planetFactory = new MarsFactory();
        Planet mars = planetFactory.createPlanet();
        earth.spinAroundStar();
        mars.spinAroundStar();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Earth count of circle around the star: "+earth.getCountOfCircleAroundStar());
                System.out.println("Mars count of circle around the star: "+mars.getCountOfCircleAroundStar());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        earth.explode();
        mars.explode();
    }
}
