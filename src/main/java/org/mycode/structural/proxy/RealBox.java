package org.mycode.structural.proxy;

public class RealBox implements Box{
    private String object = "";
    private boolean isOpen = false;
    @Override
    public void openBox(){
        System.out.println("Box has been opened");
        isOpen = true;
    }
    @Override
    public void closeBox(){
        System.out.println("Box has been closed");
        isOpen = false;
    }
    @Override
    public void pushObject(String nameOfObject) {
        if(isOpen){
            object = nameOfObject;
        }else {
            System.out.println("Box is closed, so you cannot push this object here");
        }
    }
    @Override
    public String pullObject() {
        if(isOpen){
            return object;
        }else {
            System.out.println("Box is closed, so you cannot take this object from here");
            return null;
        }
    }
}
