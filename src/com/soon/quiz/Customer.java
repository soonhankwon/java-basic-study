package com.soon.quiz;

public class Customer {

    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void order(int price) {
        paid(price);
    }

    public void paid(int price) {
        this.money -= price;
    }

    public void showInfo() {
        System.out.println(this.name + " : money = " + this.money);
    }
}
