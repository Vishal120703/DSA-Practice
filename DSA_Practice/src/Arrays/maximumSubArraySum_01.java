package Arrays;

public class maximumSubArraySum_01 {
    public static void maximumSubArray(int[]arr,int k){
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i<k; i++){
            sum+=arr[i];
        }
        maxSum = sum;
        for(int i = k; i < arr.length; i++){
            sum -= arr[i-k];
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);

        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        maximumSubArray(arr,k);
    }
}
