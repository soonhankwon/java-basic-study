package com.soon.quiz3;

import java.util.ArrayList;

import static com.soon.quiz3.Grade.GOLD;
import static com.soon.quiz3.Grade.VIP;

public class Agent {

    private ArrayList<Customer> customerLine = new ArrayList<>();
    private Grade grade;

    public Agent(Grade grade) {
        this.grade = grade;
    }

    public void getCustomerCall(Customer customer) throws InterruptedException {
        customerLine.add(customer);
        endCall();
        System.out.println("END CALL" + customer);
        customerLine.remove(customer);
    }

    public void endCall() throws InterruptedException {
        if(this.grade == VIP)
            Thread.sleep(1000);
        if(this.grade == GOLD)
            Thread.sleep(2000);
        else
            Thread.sleep(3000);
    }
}
