package org.mycode.behavioral.command;

public class Processor {
    public void mov(String r1, String r2){
        System.out.println(r1+" moved to "+r2);
    }
    public void mvi(String r, int value){
        System.out.println(value+" moved to "+r);
    }
    public void add(String r1, String r2){
        System.out.println(r1+" added to "+r2+" and write to "+r1);
    }
}
