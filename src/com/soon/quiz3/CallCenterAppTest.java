package com.soon.quiz3;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class CallCenterAppTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Customer> customers = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> customers.add(new Customer(Grade.SILVER)));
        IntStream.range(0, 3).forEach(i -> customers.add(new Customer(Grade.GOLD)));
        IntStream.range(0, 3).forEach(i -> customers.add(new Customer(Grade.VIP)));

//        Scheduler scheduler = new RoundRobin();
        Scheduler scheduler = new PriorityAllocation();
        customers.forEach(scheduler::getNextCall);
        scheduler.sendCallToAgent(new Agent(Grade.VIP));
    }
}
