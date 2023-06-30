package com.soon.multiinterface;

public class CustomerAppTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();

        System.out.println("===================");

        Sell seller = new Customer();
        seller.sell();
        Buy buyer = new Customer();
        buyer.buy();

        customer.print();
    }
}
