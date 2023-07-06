package com.soon.iostream;

import java.io.*;

public class Person implements Serializable {

    private static final long serialVersionUID = -1503252402544036183L;

    private String name;
    transient private String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Kim", "Manager");
        Person person1 = new Person("Lee", "Leader");

        try (FileOutputStream fos = new FileOutputStream("serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person ps = (Person) ois.readObject();
            Person ps1 = (Person) ois.readObject();

            System.out.println(ps);
            System.out.println(ps1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
