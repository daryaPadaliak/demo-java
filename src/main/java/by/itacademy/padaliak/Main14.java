package by.itacademy.padaliak;

public class Main14 {
    public static void main(String[] args) {
        int[] arr = {1, -8982, -904, -78875};
        int result;
        result = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]<result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
