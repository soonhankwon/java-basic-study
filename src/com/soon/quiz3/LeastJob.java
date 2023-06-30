package com.soon.quiz3;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall(Customer customer) {
        System.out.println("LeastJob.getNextCall");
    }

    @Override
    public void sendCallToAgent(Agent agent) {
        System.out.println("LeastJob.sendCallToAgent");
    }
}
