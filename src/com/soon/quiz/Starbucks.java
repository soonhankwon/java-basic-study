package com.soon.quiz;

import java.util.HashMap;
import java.util.Map;

public class Starbucks implements CoffeeShop{

    private Map<Coffee, Integer> menuMap = new HashMap<>();

    @Override
    public void readyToStart() {
        menuMap.put(new Coffee("Americano"), 4000);
        menuMap.put(new Coffee("Latte"), 4500);
    }

    @Override
    public int takeOrder(String menu) {
        return menuMap.get(new Coffee(menu));
    }
}
