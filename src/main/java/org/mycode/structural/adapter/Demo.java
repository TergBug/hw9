package org.mycode.structural.adapter;

public class Demo {
    public static void main(String[] args) {
        Star blackHole = new AdapterBlackHoleToStar();
        blackHole.born();
        blackHole.light();
        blackHole.supernova();
    }
}
