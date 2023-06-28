package com.soon.quiz;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBeans implements CoffeeShop{

    private Map<Coffee, Integer> menuMap = new HashMap<>();

    @Override
    public void readyToStart() {
        menuMap.put(new Coffee("Americano"), 3000);
        menuMap.put(new Coffee("Latte"), 4500);
    }

    @Override
    public int takeOrder(String menu) {
        return menuMap.get(new Coffee(menu));
    }
}
