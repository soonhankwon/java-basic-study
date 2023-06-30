package com.soon.interfaceexam;

public class CalcAppTest {

    public static void main(String[] args) {
        Calc completeCalc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;

        System.out.println(completeCalc.add(num1, num2));
        System.out.println(completeCalc.substract(num1, num2));
        System.out.println(completeCalc.times(num1, num2));
        System.out.println(completeCalc.divide(num1, num2));

        System.out.println(Calc.PI);
        System.out.println(Calc.Error);
    }
}
