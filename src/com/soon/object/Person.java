package com.soon.object;

public class Person {

    private String name;
    private int age;

    public Person() {
        this("no name", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name + " : " + person.age);
        System.out.println(person.getPerson());
        System.out.println(person);
    }
}
