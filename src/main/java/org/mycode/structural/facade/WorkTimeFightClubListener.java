package org.mycode.structural.facade;

public class WorkTimeFightClubListener implements Runnable {
    private FightClub fightClub;
    private Fighter[] fighters;
    public WorkTimeFightClubListener(FightClub fightClub, Fighter[] fighters) {
        this.fightClub = fightClub;
        this.fighters = fighters;
        new Thread(this).start();
    }
    @Override
    public void run() {
        while (true){
            if(!fightClub.isOpen()){
                for (Fighter fighter : fighters) {
                    fighter.setFighting(false);
                }
                break;
            }
        }
    }
}
