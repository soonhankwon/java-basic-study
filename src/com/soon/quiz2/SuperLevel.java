package com.soon.quiz2;

public class SuperLevel extends PlayerLevel{
    @Override
    void run() {
        System.out.println("VERT FAST RUN");
    }

    @Override
    void jump() {
        System.out.println("HIGH JUMP");
    }

    @Override
    void turn() {
        System.out.println("TURN");
    }

    @Override
    void showLevelMessage() {
        System.out.println("SUPER LEVEL");
    }
}
