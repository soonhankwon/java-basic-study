package com.soon.decoratorpattern;

public class KenyaAmericano extends Coffee{

    @Override
    public void brewing() {
        System.out.print("KenyaAmericano.brewing");
    }
}
