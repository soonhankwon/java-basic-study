package com.soon.map;

import java.util.Objects;

public class Member {

    private static long sequence = 0;

    private long memberId;
    private String memberName;

    public Member(String memberName) {
        this.memberId = ++sequence;
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberId == member.memberId && Objects.equals(memberName, member.memberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, memberName);
    }

    public long getMemberId() {
        return memberId;
    }
}
