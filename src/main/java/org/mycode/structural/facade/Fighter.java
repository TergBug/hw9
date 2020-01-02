package org.mycode.structural.facade;

public class Fighter {
    private String name;
    private boolean isFighting;
    public Fighter(String name) {
        this.name = name;
        this.isFighting = false;
    }
    public String getName() {
        return name;
    }
    public boolean isFighting() {
        return isFighting;
    }
    public void setFighting(boolean fighting) {
        isFighting = fighting;
    }
}
