package org.mycode.creational.abstractfactory.solar;

import org.mycode.creational.abstractfactory.Planet;

public class SolarSystemPlanet implements Planet {
    private String name;
    private int size;
    private int distanceToStar;
    private int numberOfMoons;
    private int countSpinItself;
    private int countSpinStar;
    private boolean isExplode;
    private Thread spinItself;
    private Thread spinStar;
    public SolarSystemPlanet(String name, int size, int distanceToStar, int numberOfMoons) {
        this.name = name;
        this.size = size;
        this.distanceToStar = distanceToStar;
        this.numberOfMoons = numberOfMoons;
        this.countSpinItself = 0;
        this.countSpinStar = 0;
        this.isExplode = false;
        this.spinItself = new Thread(() -> {
            try {
                while (!isExplode){
                    countSpinItself++;
                    Thread.sleep(this.size);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        this.spinStar = new Thread(() -> {
            try {
                while (!isExplode){
                    countSpinStar++;
                    Thread.sleep(this.distanceToStar);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public int getDistanceToStar() {
        return distanceToStar;
    }
    public int getNumberOfMoons() {
        return numberOfMoons;
    }
    public int getCountSpinItself() {
        return countSpinItself;
    }
    public int getCountSpinStar() {
        return countSpinStar;
    }
    @Override
    public void born() {
        System.out.println(name+" has been born");
    }
    @Override
    public void spinAroundItself() {
        spinItself.start();
    }
    @Override
    public void spinAroundStar() {
        spinStar.start();
    }
    @Override
    public void explode() {
        try {
            isExplode = true;
            spinItself.join();
            spinStar.join();
            System.out.println(name+" explode");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return "SolarSystemPlanet{" +
                "name='" + name + '\'' +
                ", radius=" + size +
                ", distanceToStar=" + distanceToStar +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}
