package com.soon.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {

    public static void main(String[] args) {

        Customer customerLee = new Customer("이순신", 40);
        Customer customerKim = new Customer("김유신", 20);
        Customer customerHong = new Customer("홍길동", 13);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customerLee);
        customers.add(customerKim);
        customers.add(customerHong);

        TravelCompany travelCompany = new TravelCompany();
        travelCompany.takePackageCustomers(customers);

        System.out.println(travelCompany.getPackageTotalCost());
        System.out.println(travelCompany.findCustomerByName("이순신"));
        System.out.println(travelCompany.findCustomerByAgeMore(10));
    }

    private static class TravelCompany {
        private ArrayList<Customer> customers;

        public TravelCompany() {
            this.customers = new ArrayList<>();
        }

        public void takePackageCustomers(ArrayList<Customer> customers) {
            this.customers.addAll(customers);
        }

        public int getPackageTotalCost() {
            return customers.stream().mapToInt(Customer::getCost).sum();
        }

        public Customer findCustomerByName(String name) {
            return customers.stream()
                    .filter(c -> c.getName().equals(name))
                    .findFirst().orElseThrow();
        }

        public List<Customer> findCustomerByAgeMore(int age) {
            return customers.stream()
                    .filter(c -> c.getAge() >= age)
                    .collect(Collectors.toList());
        }
    }

    private static class Customer {
        private String name;
        private int age;
        private final int cost;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getCost() {
            return cost;
        }

        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
            if (age >= 15) {
                this.cost = 100;
            } else {
                this.cost = 50;
            }
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", cost=" + cost +
                    '}';
        }
    }
}
