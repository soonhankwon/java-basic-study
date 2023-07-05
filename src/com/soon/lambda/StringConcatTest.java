package com.soon.lambda;

public class StringConcatTest {

    public static void main(String[] args) {
        StringConcatImpl stringConcatOop = new StringConcatImpl();

        String s1 = "JAVA";
        String s2 = "SPRING";

        String concat1 = stringConcatOop.makeString(s1, s2);
        System.out.println(concat1);

        // anonymous inner class 가 만들어진다.
        int a = 1;
        StringConcat stringConcatF = (str1, str2) -> {
            System.out.println(a);
//            a =2; // cant (anonymous inner class)
            return str1 + " : " + str2;
        };
        String concat2 = stringConcatF.makeString(s1, s2);
        System.out.println(concat2);
    }
}
