package com.soon.thread;

import java.io.IOException;

public class TerminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminateThread(String name) {
        super(name);
    }

    public void run() {
        while(!flag) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + "end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TerminateThread thA = new TerminateThread("ThreadA");
        TerminateThread thB = new TerminateThread("ThreadB");
        TerminateThread thC = new TerminateThread("ThreadC");

        thA.start();
        thB.start();
        thC.start();

        int in;
        while(true) {
            in = System.in.read();
            if(in == 'A') {
                thA.setFlag(true);
            } else if (in == 'B') {
                thB.setFlag(true);
            } else if (in == 'C') {
                thC.setFlag(true);
            } else if (in == 'M') {
                thA.setFlag(true);
                thB.setFlag(true);
                thC.setFlag(true);
                break;
            } else {
                System.out.println("type again");
            }
        }

        System.out.println("main end");
    }
}
