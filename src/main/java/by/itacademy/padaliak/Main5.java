package by.itacademy.padaliak;

import by.itacademy.padaliak.Calculator;

public class Main5 {
    public static void main(String[] args) {
        int[] numbers = {1, 12, 22};
        System.out.println(numbers[2]);
        numbers[0] = 100;
        System.out.println(numbers[0]);
        int sum;
        int max;
        sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println(sum);
        sum = Calculator.calculateSumOfArray(numbers);
        System.out.println(sum);
        max = Calculator.calculateMax(numbers);
        System.out.println(max);
    }
}
