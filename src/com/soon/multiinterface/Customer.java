package com.soon.multiinterface;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("Customer.buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer.sell");
    }

    @Override
    public void print() {
        System.out.println("OVERRIDE PRINT METHOD");
    }
}
