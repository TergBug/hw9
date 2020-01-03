package org.mycode.behavioral.visitor;

public class Earth implements Planet{
    @Override
    public void haveDay(Star star) {
        star.lightOnPlanet(this);
        if (star instanceof Sun) {
            System.out.println("Earth has day");
        }
    }
    @Override
    public void haveNight() {
        System.out.println("Earth has night");
    }
}
