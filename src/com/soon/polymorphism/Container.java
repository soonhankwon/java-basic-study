package com.soon.polymorphism;

public class Container {

    public Car car(String mark) {
        if (mark.equals("B"))
            return beClass();
        else
            return fGolf();
    }

    public BEClass beClass() {
        return new BEClass();
    }

    public FGolf fGolf() {
        return new FGolf();
    }
}
