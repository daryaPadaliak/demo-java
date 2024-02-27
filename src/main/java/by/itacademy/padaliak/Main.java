package by.itacademy.padaliak;

import by.itacademy.padaliak.Calculator;

public class Main {
    public static void main(String[] args) {
        double a = 1.4;
        double b = 1.6;
        double result;
        result = a + b;
        System.out.println(result);
        result = Calculator.calculateSum(1.4, 1.6);
        System.out.println(result);
        System.out.println(Calculator.calculateSum(1.2, 1.3));
        System.out.println(Calculator.calculateSum(a, b));
        result = Calculator.calculateSum(a, b);
        System.out.println(result);
        result = Calculator.calculateSubtraction(a, b);
        System.out.println(result);
        System.out.println(Calculator.calculateMultiply(a, b));
        result = Calculator.calculateDivide(a, b);
        System.out.println(result);
    }

}
