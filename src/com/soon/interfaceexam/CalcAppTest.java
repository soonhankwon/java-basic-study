package com.soon.interfaceexam;

public class CalcAppTest {

    public static void main(String[] args) {
        Calc completeCalc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;
        int n1 = completeCalc.add(num1, num2);
        System.out.println("n1 = " + n1);
        int n2 = completeCalc.substract(num1, num2);
        System.out.println("n2 = " + n2);
        int n3 = completeCalc.times(num1, num2);
        System.out.println("n3 = " + n3);
        int n4 = completeCalc.divide(num1, num2);
        System.out.println("n4 = " + n4);

        int[] numbers = {n1, n2, n3, n4};

        System.out.println(Calc.PI);
        System.out.println(Calc.Error);

        System.out.println("===================");
        completeCalc.description();

        int sum = Calc.staticMethodInterfaceTotal(numbers);
        System.out.println(sum);
        System.out.println("===================");
        completeCalc.descriptionV2();
    }
}
