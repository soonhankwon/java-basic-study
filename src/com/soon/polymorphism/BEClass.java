package com.soon.polymorphism;

public class BEClass implements Car {

    @Override
    public void startEngine() {
        System.out.println("BEClass.startEngine");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("BEClass.increaseSpeed");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("BEClass.decreaseSpeed");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("BEClass.turnOffEngine");
    }
}
