package com.soon.quiz2;

public class BeginnerLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("SLOW RUN");
    }

    @Override
    void jump() {
    }

    @Override
    void turn() {
    }

    @Override
    void showLevelMessage() {
        System.out.println("BEGINNER LEVEL");
    }
}
