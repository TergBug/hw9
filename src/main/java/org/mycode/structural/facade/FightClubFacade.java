package org.mycode.structural.facade;

public class FightClubFacade {
    private FightClub fightClub;
    private Fighter[] fighters;
    private Fight[] fights;
    private WorkTimeFightClubListener workTimeFightClubListener;
    public FightClubFacade(FightClub fightClub, Fighter[] fighters) {
        this.fightClub = fightClub;
        this.fighters = fighters;
        this.fights = new Fight[this.fightClub.getRings().length];
        for (int fightsIndex = 0, fightersIndex = 0; fightsIndex < fights.length; fightsIndex++) {
            fights[fightsIndex] = new Fight(this.fightClub.getRings()[fightsIndex],
                    this.fighters[fightersIndex],
                    this.fighters[(fightersIndex+1<fighters.length) ? fightersIndex+1 : 0]);
            fightersIndex = (fightersIndex+2<fighters.length) ? fightersIndex+2 : 0;
        }
        workTimeFightClubListener = new WorkTimeFightClubListener(this.fightClub, this.fighters);
    }
    public void startAllFight(){
        for (int i = 0; i < fights.length; i++) {
            for (int j = i; j < fights.length; j++) {
                if (!fights[j].startFight()) break;
            }
            for (Fight fight : fights) {
                fight.endFight();
            }
        }
        fightClub.setOpen(false);
    }
}
