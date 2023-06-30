package com.soon.quiz3;

public interface Scheduler {

    void getNextCall(Customer customer);
    void sendCallToAgent(Agent agent) throws InterruptedException;
}
