package com.soon.quiz;

public class CarFactory {
    private static final CarFactory carFactory = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        return carFactory;
    }

    public Car produceCar() {
        return new Car();
    }
}
