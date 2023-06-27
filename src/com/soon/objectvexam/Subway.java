package com.soon.objectvexam;

public class Subway implements Transportation {
    private String color;

    private int passengerCount;
    private int fee;

    public Subway(String color, int fee) {
        this.color = color;
        this.fee = fee;
    }

    @Override
    public void take(Student student) {
        student.charge(this.fee);
        increasePassengerCount();
    }

    @Override
    public void increasePassengerCount() {
        this.passengerCount++;
    }

    @Override
    public void printTransportationInfo() {
        System.out.println(this.color + " subway " + "current passengers : " + this.passengerCount + " total income : " + this.passengerCount * this.fee);
    }
}
