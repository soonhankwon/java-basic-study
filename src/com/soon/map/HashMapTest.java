package com.soon.map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Long, Member> map = new HashMap<>();

        Member soon = new Member("SOON");
        Member han = new Member("HAN");
        Member java = new Member("JAVA");
        Member spring = new Member("SPRING");

        map.put(soon.getMemberId(), soon);
        map.put(han.getMemberId(), han);
        map.put(java.getMemberId(), java);
        map.put(spring.getMemberId(), spring);

        map.forEach((key, value) -> System.out.println("KEY : " + key + " VALUE : " + value));

        Iterator<Long> iterator = map.keySet().iterator();
        iterator.forEachRemaining(i -> {
            if (i == 3L) {
                iterator.remove();
            }
        });
        map.keySet().iterator().forEachRemaining(i -> System.out.println(map.get(i)));
    }
}
