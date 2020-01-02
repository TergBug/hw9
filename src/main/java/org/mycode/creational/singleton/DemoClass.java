package org.mycode.creational.singleton;

public class DemoClass {
    public static void main(String[] args) {
        Universe universeAddObjects = Universe.getInstance();
        universeAddObjects.addObject(new Object());
        universeAddObjects.addObject(new Object());
        universeAddObjects.addObject(new Object());
        Universe universeGetObjects = Universe.getInstance();
        System.out.println(universeGetObjects.getListOfObjectsInUniverse());
    }
}
