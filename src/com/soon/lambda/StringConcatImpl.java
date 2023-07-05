package com.soon.lambda;

public class StringConcatImpl implements StringConcat{

    @Override
    public String makeString(String s1, String s2) {
        return s1 + s2;
    }
}
