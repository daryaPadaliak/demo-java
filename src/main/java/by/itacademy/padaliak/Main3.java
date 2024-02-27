package by.itacademy.padaliak;

public class Main3 {
    public static void main(String[] args) {
        int b;
        int[] numbers = {1, 2, 3};
        b = numbers[2];
        System.out.println(b);
        numbers[2] = 100;
        b = numbers[2];
        System.out.println(b);
    }
}
