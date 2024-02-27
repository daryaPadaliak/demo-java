package by.itacademy.padaliak;

public class Main11 {
    public static void main(String[] args) {
        int[] numbers = {-787, -12, -19};
        int result;
        if (numbers[0] > numbers[1]){
            result = numbers[0];
        } else {
            result = numbers[1];
        }
        if (result < numbers[2]){
            result = numbers[2];
        }
        System.out.println(result);
    }
}
