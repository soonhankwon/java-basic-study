package com.soon.quiz3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PriorityAllocation implements Scheduler{

    private final ArrayList<Customer> waitCustomers = new ArrayList<>();

    @Override
    public void getNextCall(Customer customer) {
        waitCustomers.add(customer);
    }

    @Override
    public void sendCallToAgent(Agent agent) throws InterruptedException {
        List<Customer> sortedCustomers = waitCustomers.stream()
                .sorted((a,b) -> b.getGrade().getScore() - a.getGrade().getScore())
                .collect(Collectors.toList());

        for (Iterator<Customer> iterator = sortedCustomers.iterator(); iterator.hasNext(); ) {
            Customer customer = iterator.next();
            System.out.println(customer + " SEND CALL TO AGENT");
            iterator.remove();
            agent.getCustomerCall(customer);
        }
        System.out.println(sortedCustomers + "WAIT CUSTOMER");
    }
}
