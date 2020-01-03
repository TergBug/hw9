package org.mycode.behavioral.visitor;

public class Mars implements Planet {
    @Override
    public void haveDay(Star star) {
        star.lightOnPlanet(this);
        if (star instanceof Sun) {
            System.out.println("Mars has day");
        }
    }
    @Override
    public void haveNight() {
        System.out.println("Mars has night");
    }
}
