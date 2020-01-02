package org.mycode.creational.factory;

public abstract class Planet {
    protected int countOfCircleAroundStar;
    protected Planet(){
        countOfCircleAroundStar = 0;
    }
    public int getCountOfCircleAroundStar(){
        return countOfCircleAroundStar;
    }
    abstract void spinAroundStar();
    abstract void explode();
}
