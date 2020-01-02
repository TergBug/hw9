package org.mycode.structural.facade;

public class Ring {
    private String name;
    private boolean isFree;
    public Ring(String name, boolean isFree) {
        this.name = name;
        this.isFree = isFree;
    }
    public boolean isFree() {
        return isFree;
    }
    public void setFree(boolean free) {
        isFree = free;
    }
    public String getName() {
        return name;
    }
}
