package org.mycode.behavioral.iterator;

public class Planet implements Collection{
    private String name;
    private String[] moons;
    public Planet(String name, String[] moons) {
        this.name = name;
        this.moons = moons;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getMoons() {
        return moons;
    }
    public void setMoons(String[] moons) {
        this.moons = moons;
    }
    @Override
    public Iterator getIterator() {
        return new MoonIterator();
    }
    private class MoonIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index<moons.length;
        }
        @Override
        public Object next() {
            return moons[index++];
        }
    }
}
