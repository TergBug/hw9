package org.mycode.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        ElementsFactory elementsFactory = new ElementsFactory();
        List<ChemicalElement> elements = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            elements.add(elementsFactory.getElementByName("carbon"));
        }
        for (int i = 0; i < 16; i++) {
            elements.add(elementsFactory.getElementByName("hydrogen"));
        }
        for (int i = 0; i < 5; i++) {
            elements.add(elementsFactory.getElementByName("nitrogen"));
        }
        for (int i = 0; i < 13; i++) {
            elements.add(elementsFactory.getElementByName("oxygen"));
        }
        for (int i = 0; i < 3; i++) {
            elements.add(elementsFactory.getElementByName("phosphorus"));
        }
        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).connectToElement(elements.get(random.nextInt(elements.size())));
        }
    }
}
