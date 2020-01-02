package org.mycode.behavioral.iterator;

public class Demo {
    public static void main(String[] args) {
        Planet planet = new Planet("Jupiter", new String[]{"Europe", "Ganymede", "Io", "Callisto"});
        System.out.println(planet.getName()+"`s moons:");
        Iterator iterator = planet.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
