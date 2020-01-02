package org.mycode.behavioral.chainofresponsibility;

public abstract class LineOfProtection {
    private int power;
    private LineOfProtection nextLine;
    public LineOfProtection(int power) {
        this.power = power;
    }
    public void setNextLine(LineOfProtection nextLine) {
        this.nextLine = nextLine;
    }
    public void protect(int attackPower){
        if(attackPower<=power){
            win();
        } else {
            lose();
            if(nextLine!=null){
                nextLine.protect(attackPower);
            }
        }
    }
    public abstract void win();
    public abstract void lose();
}
