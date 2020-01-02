package org.mycode.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        Box proxyBox = new ProxyBox("1245qwerty");
        proxyBox.openBox();
        proxyBox.pushObject("Ball");
        proxyBox.closeBox();
        proxyBox = new ProxyBox("12345qwerty");
        proxyBox.openBox();
        proxyBox.pushObject("Ball");
        System.out.println("Taken object is "+proxyBox.pullObject());
        proxyBox.closeBox();
    }
}
