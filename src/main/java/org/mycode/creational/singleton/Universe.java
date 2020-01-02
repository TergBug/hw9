package org.mycode.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private static Universe universe;
    private static List<Object> listOfObjectsInUniverse;
    private Universe(){}
    public static synchronized Universe getInstance(){
        if(universe==null){
            universe = new Universe();
            listOfObjectsInUniverse = new ArrayList<>();
        }
        return universe;
    }
    public void addObject(Object object){
        listOfObjectsInUniverse.add(object);
    }
    public List<Object> getListOfObjectsInUniverse(){
        return listOfObjectsInUniverse;
    }
}
