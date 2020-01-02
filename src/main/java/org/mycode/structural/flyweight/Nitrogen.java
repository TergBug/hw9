package org.mycode.structural.flyweight;

public class Nitrogen implements ChemicalElement {
    @Override
    public void connectToElement(ChemicalElement element) {
        System.out.println("Nitrogen connects to "+element);
    }
    @Override
    public String toString() {
        return "Nitrogen";
    }
}