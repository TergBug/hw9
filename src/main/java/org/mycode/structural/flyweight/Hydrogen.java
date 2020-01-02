package org.mycode.structural.flyweight;

public class Hydrogen implements ChemicalElement {
    @Override
    public void connectToElement(ChemicalElement element) {
        System.out.println("Hydrogen connects to "+element);
    }
    @Override
    public String toString() {
        return "Hydrogen";
    }
}