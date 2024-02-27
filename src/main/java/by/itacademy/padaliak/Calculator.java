package by.itacademy.padaliak;

public class Calculator {
    public static double calculateSum(double a, double b) {
        return a + b;
    }

    public static double calculateSubtraction(double a, double b) {
        return a - b;
    }

    public static double calculateMultiply(double a, double b) {
        return a * b;
    }

    public static double calculateDivide(double a, double b) {
        return a / b;
    }

    public static int calculateMax(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static int calculateMin(int a, int b) {
        int c;
        if (a > b) {
            c = b;
        } else {
            c = a;
        }
        return c;
    }

    public static boolean isEven(int a) {
        int result;
        result = a % 2;
        return result == 0;
    }

    public static int calculateSumOfArray(int[] arr) {
        int sum;
        sum = arr[0] + arr[1] + arr[2];
        return sum;
    }

    public static int calculateMax(int[] numbers) {
        int max;
        if (numbers[0] > numbers[1]) {
            max = numbers[0];
        } else {
            max = numbers[1];
        }
        if (max < numbers[2]) {
            max = numbers[2];
        }
        return max;
    }

    public static int calculate2Max(int[] numbers) {
        int max = numbers[0];
        max = calculateMax(numbers[0], numbers[1]);
        max = calculateMax(max, numbers[2]);
        return max;
    }
}

