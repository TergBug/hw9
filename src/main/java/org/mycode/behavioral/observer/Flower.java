package org.mycode.behavioral.observer;

public class Flower implements Observer {
    private String name;
    private boolean isBloomed;
    private Sun sun;
    public Flower(String name, Sun sun) {
        this.name = name;
        this.isBloomed = true;
        this.sun = sun;
        this.sun.addObserver(this);
    }
    public boolean isBloomed() {
        return isBloomed;
    }
    private void setBloomed(boolean bloomed) {
        if (bloomed && !isBloomed){
            System.out.println(name+" opened");
        } else if (!bloomed && isBloomed){
            System.out.println(name+" closed");
        }
        isBloomed = bloomed;
    }
    @Override
    public void updateState() {
        setBloomed(sun.isLighting());
    }
}
