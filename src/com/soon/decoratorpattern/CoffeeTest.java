package com.soon.decoratorpattern;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();

        System.out.println("\n==============");

        Coffee keynaLatte = new Latte(new KenyaAmericano());
        keynaLatte.brewing();

        System.out.println("\n==============");
        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

        System.out.println("\n==============");

        Coffee mochaEtiopiaLatte = new Mocha(new Latte(new EtiopiaAmericano()));
        mochaEtiopiaLatte.brewing();
    }
}
