package org.mycode.structural.facade;

public class Demo {
    public static void main(String[] args) {
        FightClubFacade fightClubFacade = new FightClubFacade(new FightClub(true, 5),
                new Fighter[]{new Fighter("Jack"), new Fighter("Rick"), new Fighter("Ivan")});
        fightClubFacade.startAllFight();
    }
}
