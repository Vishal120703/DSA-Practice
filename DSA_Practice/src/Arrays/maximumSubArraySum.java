package Arrays;

public class maximumSubArraySum {
    public static int findMaximumSum(int[] arr){
        int currSum = 0;
        int maxSum = arr[0];
        for(int i = 0; i < arr.length; i++){
            currSum +=arr[i];
            maxSum = Math.max(maxSum,currSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        findMaximumSum(arr);
    }
}
