package com.soon.quiz3;

import java.util.ArrayList;

public class Agent {

    private ArrayList<Customer> customerLine = new ArrayList<>();
    private AgentLevel level;

    public Agent(AgentLevel level) {
        this.level = level;
    }

    public void getCustomerCall(Customer customer) throws InterruptedException {
        customerLine.add(customer);
        endCall();
        System.out.println("END CALL" + customer);
        customerLine.remove(customer);
    }

    public void endCall() throws InterruptedException {
        if(this.level == AgentLevel.LV3)
            Thread.sleep(500);
        if(this.level == AgentLevel.LV2)
            Thread.sleep(1000);
        else
            Thread.sleep(2000);
    }
}
