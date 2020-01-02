package org.mycode.structural.proxy;

public interface Box {
    void openBox();
    void closeBox();
    void pushObject(String nameOfObject);
    String pullObject();
}
