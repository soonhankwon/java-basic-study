package com.soon.object;

public class Employee {
    private static int serialNum = 1000;

    private String name;
    private int number;

    public Employee(String name) {
        this.name = name;
        this.number = ++Employee.serialNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public static void main(String[] args) {
        Employee soonhan = new Employee("soonhan");
        Employee kyuri = new Employee("kyuri");

        System.out.println(soonhan);
        System.out.println(kyuri);
    }
}
