package org.mycode.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        Atmosphere atmosphere = new Atmosphere(new Sunny());
        atmosphere.doWeather();
        atmosphere.setWeather(new Rainy());
        atmosphere.doWeather();
        atmosphere.setWeather(new Storm());
        atmosphere.doWeather();
        atmosphere.setWeather(new Foggy());
        atmosphere.doWeather();
        atmosphere.setWeather(new Snowy());
        atmosphere.doWeather();
    }
}
