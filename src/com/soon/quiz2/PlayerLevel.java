package com.soon.quiz2;

import java.util.stream.IntStream;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    public final void go(int count) {
        run();
        IntStream.range(0, count).forEach(i -> {
            jump();
        });
        turn();
    }
}
