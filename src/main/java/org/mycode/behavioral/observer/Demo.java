package org.mycode.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        Sun sun = new Sun(true);
        Flower chamomile = new Flower("Chamomile", sun);
        Flower rose = new Flower("Rose", sun);
        Flower orchid = new Flower("Orchid", sun);
        sun.setLighting(false);
        sun.setLighting(true);
    }
}
