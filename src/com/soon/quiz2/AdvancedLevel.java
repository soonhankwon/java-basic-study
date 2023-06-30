package com.soon.quiz2;

public class AdvancedLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("FAST RUN");
    }

    @Override
    void jump() {
        System.out.println("JUMP");
    }

    @Override
    void turn() {
    }

    @Override
    void showLevelMessage() {
        System.out.println("ADVANCED LEVEL");
    }
}
