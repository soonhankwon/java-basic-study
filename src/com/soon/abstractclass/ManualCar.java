package com.soon.abstractclass;

public class ManualCar extends Car{

    @Override
    void startCar() {
        System.out.println("ManualCar.startCar");
    }

    @Override
    void drive() {
        System.out.println("ManualCar.drive");
    }

    @Override
    void stop() {
        System.out.println("ManualCar.stop");
    }
}
