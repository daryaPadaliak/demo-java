package by.itacademy.padaliak;

import by.itacademy.padaliak.Calculator;

public class Main2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        c = Calculator.calculateMax(a, b);
        System.out.println("max " + c);
        c = Calculator.calculateMin(a, b);
        System.out.println("min " + c);
        System.out.println(Calculator.isEven(100));

    }
}
