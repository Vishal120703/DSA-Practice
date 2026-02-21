package Arrays;

public class MaximumConsecutive1s {
    public static void MaximumConsecutive(int[]arr){
        int count = 0;
        int maxLen = 0;
        for(int i= 0; i < arr.length; i++){
            if(arr[i] == 1){
                count++;
                maxLen = Math.max(maxLen,count);
            }
            else{
                count = 0;
            }

        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr = {0};
        MaximumConsecutive(arr);
    }
}
