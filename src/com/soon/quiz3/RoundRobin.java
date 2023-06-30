package com.soon.quiz3;

import java.util.ArrayList;
import java.util.Iterator;

public class RoundRobin implements Scheduler {
    private final ArrayList<Customer> waitCustomers = new ArrayList<>();

    @Override
    public void getNextCall(Customer customer) {
        waitCustomers.add(customer);
    }

    @Override
    public void sendCallToAgent(Agent agent) throws InterruptedException {
        for (Iterator<Customer> iterator = waitCustomers.iterator(); iterator.hasNext(); ) {
            Customer customer = iterator.next();
            System.out.println(customer + " SEND CALL TO AGENT");
            iterator.remove();
            agent.getCustomerCall(customer);
        }
        System.out.println(waitCustomers + "WAIT CUSTOMER");
    }
}
