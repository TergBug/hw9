package org.mycode.behavioral.visitor;

public class Demo {
    public static void main(String[] args) {
        InnerSolarSystem innerSolarSystem = new InnerSolarSystem();
        Star sun = new Sun();
        Star sirius = new Sirius();
        innerSolarSystem.haveDay(sun);
        System.out.println("\n===================\n");
        innerSolarSystem.haveDay(sirius);
        innerSolarSystem.haveNight();
    }
}
