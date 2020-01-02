package org.mycode.behavioral.memento;

public class GameProgress {
    private String name;
    private int percentOfProgress;
    public GameProgress(String name) {
        this.name = name;
        this.percentOfProgress = 0;
    }
    public String getName() {
        return name;
    }
    public void playGame(int newPercent){
        this.percentOfProgress = newPercent;
    }
    public Save getSave(){
        return new Save(this.name, this.percentOfProgress);
    }
    public void load(Save save){
        this.name = save.getName();
        this.percentOfProgress = save.getPercentOfProgress();
    }
    @Override
    public String toString() {
        return "Game \"" + name +
                "\", percentOfProgress=" + percentOfProgress;
    }
}
