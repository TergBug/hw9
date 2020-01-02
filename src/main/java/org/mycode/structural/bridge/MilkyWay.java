package org.mycode.structural.bridge;

public class MilkyWay extends Galaxy {
    protected MilkyWay(Star mostStar) {
        super(mostStar);
    }
    @Override
    void mostTypeOfStars() {
        System.out.print("Millions ");
        mostStar.born();
        System.out.print("And millions ");
        mostStar.supernova();
        System.out.println("But the most stars in Milky Way are "+mostStar.getColor());
    }
}
