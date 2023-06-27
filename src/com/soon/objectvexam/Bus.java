package com.soon.objectvexam;

public class Bus implements Transportation {
    private int number;
    private int fee;

    private int passengerCount;

    public Bus(int number, int fee) {
        this.number = number;
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
        System.out.println(this.number + "number bus " + "current passengers : " + this.passengerCount + " total income : " + this.passengerCount * this.fee);
    }
}
