package com.soon.abstractclass;

public abstract class Car {
    void startCar() {
        System.out.println("Car.startCar");
    }

    abstract void drive();
    abstract void stop();

    void turnOff() {
        System.out.println("Car.turnOff");
    }

    final void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

}
