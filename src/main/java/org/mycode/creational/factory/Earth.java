package org.mycode.creational.factory;

public class Earth extends Planet {
    private Thread spinning;
    private boolean isExploded;
    public Earth(){
        super();
        isExploded = false;
        spinning = new Thread(() -> {
            try {
                while (!isExploded){
                    Thread.sleep(5000);
                    countOfCircleAroundStar++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
    @Override
    public void spinAroundStar() {
        spinning.start();
    }
    @Override
    public void explode() {
        try {
            isExploded = true;
            spinning.join();
            System.out.println("Earth has exploded!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
