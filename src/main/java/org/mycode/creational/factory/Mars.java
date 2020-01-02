package org.mycode.creational.factory;

public class Mars extends Planet {
    private Thread spinning;
    private boolean isExploded;
    public Mars(){
        super();
        isExploded = false;
        spinning = new Thread(() -> {
            try {
                while (!isExploded){
                    Thread.sleep(8000);
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
            System.out.println("Mars has exploded!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
