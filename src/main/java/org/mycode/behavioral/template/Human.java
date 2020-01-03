package org.mycode.behavioral.template;

public abstract class Human {
    public void showInfo(){
        System.out.println("Kingdom: Animals");
        System.out.println("Phylum: Chordata");
        System.out.println("Class: Mammalia");
        System.out.println("Order: Primates");
        System.out.println("Family: Hominidae");
        System.out.println("Genus: Homo");
        System.out.println("Species: Homo sapiens");
        showRace();
        showEthnos();
        showNation();
    }
    public abstract void showRace();
    public abstract void showEthnos();
    public abstract void showNation();
}
