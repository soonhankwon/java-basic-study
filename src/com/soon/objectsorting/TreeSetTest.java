package com.soon.objectsorting;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(2);

        treeSet.iterator().forEachRemaining(System.out::println);

        TreeSet<Member> memberTreeSet = new TreeSet<>();
        memberTreeSet.add(new Member(3, "SOON"));
        memberTreeSet.add(new Member(1, "HAN"));
        memberTreeSet.add(new Member(2, "KYU"));

        memberTreeSet.iterator().forEachRemaining(System.out::println);
    }
}
