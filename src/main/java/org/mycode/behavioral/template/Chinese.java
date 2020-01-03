package org.mycode.behavioral.template;

public class Chinese extends Human {
    @Override
    public void showRace() {
        System.out.println("Race: Yellow");
    }
    @Override
    public void showEthnos() {
        System.out.println("Ethnos: Han");
    }

    @Override
    public void showNation() {
        System.out.println("Nation: Chinese");
    }
}
