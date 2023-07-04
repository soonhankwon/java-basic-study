package com.soon.string;

public class StringTest {

    public static void main(String[] args) {
        String java = new String("java");
        String spring = new String("spring");

        System.out.println(System.identityHashCode(java));

        java = java.concat(spring);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));

        System.out.println("================");

        StringBuffer sb = new StringBuffer();
        System.out.println(System.identityHashCode(sb));
        sb.append(java);
        System.out.println(System.identityHashCode(sb));

        java = sb.toString();
        System.out.println(java);
    }
}
