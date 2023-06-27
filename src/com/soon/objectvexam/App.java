package com.soon.objectvexam;

public class App {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);

        Transportation bus = new Bus(100, 1000);
        Transportation subway = new Subway("green", 1200);

        bus.take(james);
        subway.take(tomas);

        james.printMyMoney();
        tomas.printMyMoney();

        bus.printTransportationInfo();
        subway.printTransportationInfo();
    }
}
