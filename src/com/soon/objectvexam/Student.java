package com.soon.objectvexam;

public class Student {

    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void charge(int fee) {
        this.money -= fee;
    }

    public void printMyMoney() {
        System.out.println(this.money);
    }
}
