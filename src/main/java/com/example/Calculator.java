package com.example;
public class Calculator {
    public double calc(double a, double b) {
        double x = a + b;
        double y = a * b;
        return x / y;
    }

    public void prtRes(double res) {
        System.out.println("Result: " + res);
    }
    //main method to test
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.calc(10, 5);
        calc.prtRes(result);
    }
}