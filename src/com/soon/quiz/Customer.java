package com.soon.quiz;

public class Customer {

    private String name;
    private int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void order(int price) {
        System.out.println(this.name + " order");
        paid(price);
    }

    public void paid(int price) {
        this.money -= price;
        System.out.println(this.name + " paid" + price);
    }

    public void showInfo() {
        System.out.println(this.name + " : money = " + this.money);
    }
}
