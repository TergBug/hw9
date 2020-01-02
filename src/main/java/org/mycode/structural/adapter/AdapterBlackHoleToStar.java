package org.mycode.structural.adapter;

public class AdapterBlackHoleToStar extends BlackHole implements Star{
    @Override
    public void born() {
        compressFromSupernova();
    }
    @Override
    public void light() {
        absorbAnything();
    }
    @Override
    public void supernova() {
        evaporate();
    }
}
