package org.mycode.behavioral.observer;

public class Sun extends Subject{
    private boolean isLighting;
    public Sun(boolean isLighting) {
        this.isLighting = isLighting;
    }
    public boolean isLighting() {
        return isLighting;
    }
    public void setLighting(boolean lighting) {
        if (lighting && !isLighting){
            System.out.println("Sunrise");
        } else if (!lighting && isLighting){
            System.out.println("Sunset");
        }
        isLighting = lighting;
        notifyObservers();
    }
    @Override
    void notifyObservers() {
        observers.forEach(Observer::updateState);
    }
}
