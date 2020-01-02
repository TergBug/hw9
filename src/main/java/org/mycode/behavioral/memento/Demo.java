package org.mycode.behavioral.memento;

public class Demo {
    public static void main(String[] args) {
        GameProgress game = new GameProgress("Good Game");
        PCRepository pcRepository = new PCRepository();
        System.out.println("I`m playing Good Game...");
        game.playGame(10);
        System.out.println("Saved on 10 percent");
        pcRepository.setSave(game.getSave());
        System.out.println("Reboot PC");
        System.out.println("Start Good Game from save point");
        game = new GameProgress("");
        game.load(pcRepository.getSave());
        System.out.println(game.toString());
    }
}
