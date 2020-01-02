package org.mycode.structural.composite;

public class Num {
    private double real;
    private double imaginary;
    public Num(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    @Override
    public String toString() {
        return real+((imaginary!=0) ? ((imaginary>0) ? "+" : "-")+imaginary+"i" : "");
    }
}
