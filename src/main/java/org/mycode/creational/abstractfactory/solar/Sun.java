package org.mycode.creational.abstractfactory.solar;

import org.mycode.creational.abstractfactory.Star;

public class Sun implements Star {
    @Override
    public void born() {
        System.out.println("Sun has been born");
    }
    @Override
    public void supernova() {
        System.out.println("Sun explode to Supernova");
    }
}
