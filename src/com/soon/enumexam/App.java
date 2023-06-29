package com.soon.enumexam;

public class App {

    public static void main(String[] args) {

        Customer soon = new Customer("SOON", MemberShip.VIP);
        Customer han = new Customer("HAN", MemberShip.GENERAL);

        soon.chargePoint(20000);
        soon.buyItem(new Item("JAVA BOOK", 15000));
        soon.buyItem(new Item("SPRING BOOK", 5000));

        han.chargePoint(10000);
        han.buyItem(new Item("SPRING BOOK", 5000));

        System.out.println(soon);
        System.out.println(han);
    }
}
