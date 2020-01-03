package org.mycode.behavioral.strategy;

public class Atmosphere {
    private Weather weather;
    public Atmosphere(Weather weather) {
        this.weather = weather;
    }
    public void setWeather(Weather weather) {
        this.weather = weather;
    }
    public void doWeather(){
        weather.goAction();
    }
}
