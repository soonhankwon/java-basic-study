package com.soon.thread;

import java.util.stream.IntStream;

class PriorityThread extends Thread {

    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t + " : start");
        int sum = IntStream.rangeClosed(0, 1000000).sum();

        System.out.println(t.getPriority() + "end");
    }
}

public class PriorityTest {

    public static void main(String[] args) {
        int i;
        for (i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
            PriorityThread pt = new PriorityThread();
            pt.setPriority(i);
            pt.start();
        }
    }
}
