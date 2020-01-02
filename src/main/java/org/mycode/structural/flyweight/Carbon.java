package org.mycode.structural.flyweight;

public class Carbon implements ChemicalElement {
    @Override
    public void connectToElement(ChemicalElement element) {
        System.out.println("Carbon connects to "+element);
    }
    @Override
    public String toString() {
        return "Carbon";
    }
}
