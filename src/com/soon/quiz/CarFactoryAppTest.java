package com.soon.quiz;

public class CarFactoryAppTest {

    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();

        Car car1 = carFactory.produceCar();
        Car car2 = carFactory.produceCar();

        car1.showInfo();
        car2.showInfo();
    }
}
