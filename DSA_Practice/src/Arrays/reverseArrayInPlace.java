package Arrays;

public class reverseArrayInPlace {
    public static void reverse(int[]arr){
        int last = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
