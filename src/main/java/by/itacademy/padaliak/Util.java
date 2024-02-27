package by.itacademy.padaliak;

public class Util {
    public static int calculateSum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public static int calculateSumOfArray(int[] arr) {
        int sum;
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double calculateAverage(int a, int b) {
        double average;
        average = (double) (a + b) / 2;
        return average;
    }

    public static double calculateAverageOfArray(int[] arr) {

        return (double) calculateSumOfArray(arr) / arr.length;
    }

    public static int calculateMax(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int calculateMaxOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int calculateMin(int a, int b) {
        int result;
        if (a < b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static int calculateMinOfArray(int[] arr) {
        int result;
        result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static String getTheYoungestFromTheArray(User[] users) {
        int[] ages = new int[]{users[0].age, users[1].age, users[2].age};
        String[] names = {users[0].name, users[1].name, users[2].name};

        int age = ages[0];
        String name = names[0];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < age) {
                age = ages[i];
                name = names[i];
            }
        }
        return name;
    }
}