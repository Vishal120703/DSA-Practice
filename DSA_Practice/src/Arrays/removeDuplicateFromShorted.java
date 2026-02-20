package Arrays;

public class removeDuplicateFromShorted {
    public static void removeDuplicate(int[] arr){
        if(arr.length == 0) return;
        int first = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                first++;
                arr[first] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        removeDuplicate(arr);
    }
}
