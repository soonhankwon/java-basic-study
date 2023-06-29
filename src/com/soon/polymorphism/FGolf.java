package com.soon.polymorphism;

public class FGolf implements Car {

    @Override
    public void startEngine() {
        System.out.println("FGolf.startEngine");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("FGolf.increaseSpeed");
        specialBoostEngineGolf();
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("FGolf.decreaseSpeed");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("FGolf.turnOffEngine");
    }

    private void specialBoostEngineGolf() {
        System.out.println("FGolf.specialBoostEngineGolf");
    }
}
