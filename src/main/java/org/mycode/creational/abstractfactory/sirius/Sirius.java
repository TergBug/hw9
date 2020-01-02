package org.mycode.creational.abstractfactory.sirius;

import org.mycode.creational.abstractfactory.Star;

public class Sirius implements Star {
    private String name;
    public Sirius(String name) {
        this.name = name;
    }
    @Override
    public void born() {
        System.out.println(name+" has been born");
    }
    @Override
    public void supernova() {
        System.out.println(name+" explode to Supernova");
    }
}
