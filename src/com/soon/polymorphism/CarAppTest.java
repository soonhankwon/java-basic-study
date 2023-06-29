package com.soon.polymorphism;

public class CarAppTest {

    private final Car car;

    public CarAppTest(Container container) {
        this.car = container.car("");
    }

    public static void main(String[] args) {
        Container container = new Container();
        CarAppTest test = new CarAppTest(container);
        test.car.startEngine();
        test.car.increaseSpeed();

        //down casting
        FGolf car1 = (FGolf) test.car;
        if(car1 instanceof Car) {
            car1.specialGPS();
        }
    }
}
