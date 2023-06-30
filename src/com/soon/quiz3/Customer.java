package com.soon.quiz3;

public class Customer {

    private static int sequence = 0;

    private int id;
    private Grade grade;

    public Customer(Grade grade) {
        this.id = ++sequence;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", grade=" + grade +
                '}';
    }
}
