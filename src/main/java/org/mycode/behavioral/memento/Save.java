package org.mycode.behavioral.memento;

public class Save {
    private final String name;
    private final int percentOfProgress;
    public Save(String name, int percentOfProgress) {
        this.name = name;
        this.percentOfProgress = percentOfProgress;
    }
    public String getName() {
        return name;
    }
    public int getPercentOfProgress() {
        return percentOfProgress;
    }
}
