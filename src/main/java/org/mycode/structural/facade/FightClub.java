package org.mycode.structural.facade;

public class FightClub {
    private boolean isOpen;
    private Ring[] rings;
    public FightClub(boolean isOpen, int numberOfRings) {
        this.isOpen = isOpen;
        rings = new Ring[numberOfRings];
        for (int i = 0; i < rings.length; i++) {
            rings[i] = new Ring(String.valueOf(i),true);
        }
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean open) {
        isOpen = open;
        if(!isOpen){
            for (Ring ring : rings) {
                ring.setFree(false);
            }
        }else {
            for (Ring ring : rings) {
                ring.setFree(true);
            }
        }
    }
    public Ring[] getRings() {
        return rings;
    }
}
