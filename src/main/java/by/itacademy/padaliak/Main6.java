package by.itacademy.padaliak;

import by.itacademy.padaliak.Calculator;

public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {-5, -10, -100};
        int max;
        int index = 0;
        max = Calculator.calculateMax(numbers);
        System.out.println(max);
        max = Calculator.calculateMax(12,56);
        System.out.println(max);
        System.out.println(Calculator.calculateMax(10,20));
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
