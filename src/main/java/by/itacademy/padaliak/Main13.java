package by.itacademy.padaliak;

public class Main13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int result;
        result = arr[0];

        for(int i =0; i< arr.length; i++){
            if(arr[i]> result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
