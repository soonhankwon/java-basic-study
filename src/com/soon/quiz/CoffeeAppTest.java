package com.soon.quiz;

public class CoffeeAppTest {

    public static void main(String[] args) {
        Customer kim = new Customer("KIM", 10000);
        Customer lee = new Customer("LEE", 15000);

        CoffeeShop starbucks = new Starbucks();
        CoffeeShop coffeeBeans = new CoffeeBeans();

        starbucks.readyToStart();
        coffeeBeans.readyToStart();

        kim.order(starbucks.takeOrder("Americano"));
        lee.order(coffeeBeans.takeOrder("Latte"));

        kim.showInfo();
        lee.showInfo();
    }
}
