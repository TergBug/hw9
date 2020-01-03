package org.mycode.behavioral.visitor;

public class Mercury implements Planet {
    @Override
    public void haveDay(Star star) {
        star.lightOnPlanet(this);
        if (star instanceof Sun) {
            System.out.println("Mercury has day");
        }
    }
    @Override
    public void haveNight() {
        System.out.println("Mercury has night");
    }
}
