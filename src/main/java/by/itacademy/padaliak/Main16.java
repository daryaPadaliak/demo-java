package by.itacademy.padaliak;

import org.w3c.dom.ls.LSOutput;

public class Main16 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double result = (double) sum / arr.length;
        System.out.println(result);
    }
}
