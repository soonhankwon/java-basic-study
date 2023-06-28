package com.soon.quiz;

import java.util.Objects;

public class Coffee {
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(name, coffee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
