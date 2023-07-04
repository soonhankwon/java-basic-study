package com.soon.objectsorting;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>(new MyCompare());
        set.add("SOON");
        set.add("HAN");
        set.add("JAVA");
        set.add("SPRING");

        set.iterator().forEachRemaining(System.out::println);
    }

    private static class MyCompare implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2) * (-1);
        }
    }
}
