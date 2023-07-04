package com.soon.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Member> hashSet = new HashSet<>();

        hashSet.add(new Member(1, "SOON"));
        hashSet.add(new Member(2, "HAN"));
        hashSet.add(new Member(3, "KYU"));
        hashSet.add(new Member(4, "ERROR"));
        hashSet.add(new Member(4, "ERROR"));

        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            if (member.getMemberId() == 4) {
                iterator.remove();
            }
        }

        hashSet.removeIf(member -> member.getMemberId() == 3);
        hashSet.iterator().forEachRemaining(System.out::println);
    }
}
