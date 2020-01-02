package org.mycode.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        Galaxy milkyWay = new MilkyWay(new BlueStar());
        milkyWay.mostTypeOfStars();
    }
}
