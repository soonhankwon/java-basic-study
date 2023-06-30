package com.soon.abstractclass;

public class AICar extends Car{

    @Override
    void drive() {
        System.out.println("AICar.drive");
    }

    @Override
    void stop() {
        System.out.println("AICar.stop");
    }
}
