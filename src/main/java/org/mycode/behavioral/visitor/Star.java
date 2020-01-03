package org.mycode.behavioral.visitor;

public interface Star {
    void lightOnPlanet(Mercury mercury);
    void lightOnPlanet(Venus venus);
    void lightOnPlanet(Earth earth);
    void lightOnPlanet(Mars mars);
}
