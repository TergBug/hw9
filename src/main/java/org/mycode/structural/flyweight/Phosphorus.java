package org.mycode.structural.flyweight;

public class Phosphorus implements ChemicalElement {
    @Override
    public void connectToElement(ChemicalElement element) {
        System.out.println("Phosphorus connects to "+element);
    }
    @Override
    public String toString() {
        return "Phosphorus";
    }
}