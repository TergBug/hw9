package org.mycode.structural.facade;

public class Fight {
    private Ring ring;
    private Fighter opponent1;
    private Fighter opponent2;
    public Fight(Ring ring, Fighter opponent1, Fighter opponent2) {
        this.ring = ring;
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }
    public boolean startFight(){
        if(opponent1.isFighting() || opponent2.isFighting()){
            System.out.println("One of opponents has already started fighting");
            return false;
        }
        if(ring.isFree()){
            System.out.println(opponent1.getName()+" fights with "+opponent2.getName()+" on "+ring.getName()+" ring");
            opponent1.setFighting(true);
            opponent2.setFighting(true);
            ring.setFree(false);
        }else {
            System.out.println("For "+opponent1.getName()+" and "+opponent2.getName()+" there is no free ring");
            return false;
        }
        return true;
    }
    public void endFight(){
        opponent1.setFighting(false);
        opponent2.setFighting(false);
        ring.setFree(true);
    }
    public void setRing(Ring ring) {
        this.ring = ring;
    }
}
