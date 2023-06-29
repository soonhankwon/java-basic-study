package com.soon.di;

import java.util.HashMap;
import java.util.Map;

public class DiContainer {

    Map<String, Bean> diMap = new HashMap<>();

    public void init() {
        diMap.put("BEAN1", BeanV1.getInstance());
        diMap.put("BEAN2", BeanV2.getInstance());
    }

    public Bean getBean(String beanName) {
        return diMap.get(beanName);
    }
}
