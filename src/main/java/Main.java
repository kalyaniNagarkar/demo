//package com.example;

public class Main {

    double num1, num2;

    public double addition(double num1, double num2) {
        double addResult = num1 + num2;
        return addResult;
    }

    public double subtraction(double num1, double num2) {
        double subResult = num1 - num2;
        return subResult;
    }

    public double multiplication(double num1, double num2) {
        double mulResult = num1 * num2;
        return mulResult;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1/num2;
    }

    public static void main(String[] args) {

        System.out.println("Hello world!This is the calculator code");

        Main m = new Main();
       // m.addition(4,7);
        System.out.println("The addition is: " + m.addition(4,7));
//        m.subtraction(30,7);
        System.out.println("The subtraction is: " + m.subtraction(30,7));
//        m.multiplication(3,7);
        System.out.println("The multiplication is: " + m.multiplication(3,7));
//        m.division(10,5);
        System.out.println("The division is: " + m.division(10,0));

    }
}
