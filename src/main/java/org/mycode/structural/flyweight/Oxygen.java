package org.mycode.structural.flyweight;

public class Oxygen implements ChemicalElement {
    @Override
    public void connectToElement(ChemicalElement element) {
        System.out.println("Oxygen connects to "+element);
    }
    @Override
    public String toString() {
        return "Oxygen";
    }
}
