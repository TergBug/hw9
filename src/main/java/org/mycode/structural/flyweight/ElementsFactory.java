package org.mycode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ElementsFactory {
    private Map<String, ChemicalElement> chemicalElementMap = new HashMap<>();
    public ChemicalElement getElementByName(String name){
        ChemicalElement chemicalElement = chemicalElementMap.get(name);
        if(chemicalElement == null){
            switch (name.toLowerCase()){
                case "carbon":
                    System.out.println("Create Carbon");
                    chemicalElement = new Carbon();
                    chemicalElementMap.put(name, chemicalElement);
                    break;
                case "hydrogen":
                    System.out.println("Create Hydrogen");
                    chemicalElement = new Hydrogen();
                    chemicalElementMap.put(name, chemicalElement);
                    break;
                case "nitrogen":
                    System.out.println("Create Nitrogen");
                    chemicalElement = new Nitrogen();
                    chemicalElementMap.put(name, chemicalElement);
                    break;
                case "oxygen":
                    System.out.println("Create Oxygen");
                    chemicalElement = new Oxygen();
                    chemicalElementMap.put(name, chemicalElement);
                    break;
                case "phosphorus":
                    System.out.println("Create Phosphorus");
                    chemicalElement = new Phosphorus();
                    chemicalElementMap.put(name, chemicalElement);
                    break;
                default:
                    System.out.println("I don`t know element "+name);
            }
        }
        return chemicalElement;
    }
}
