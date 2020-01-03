package org.mycode.behavioral.visitor;

public class InnerSolarSystem implements Planet {
    private Planet[] planets;
    public InnerSolarSystem(){
        planets = new Planet[]{
                new Mercury(),
                new Venus(),
                new Earth(),
                new Mars()
        };
    }
    @Override
    public void haveDay(Star star) {
        for (Planet planet : planets) {
            planet.haveDay(star);
        }
    }
    @Override
    public void haveNight() {
        for (Planet planet : planets) {
            planet.haveNight();
        }
    }
}
