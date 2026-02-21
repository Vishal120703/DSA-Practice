package Arrays;

public class LongestSubArrayWithSumLessEqual {
    public static void longestSubarray(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        int totalSum = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum +=arr[i];
        }
        while(left<=right){
            if(totalSum <= k){
                maxLen = right-left+1;
                System.out.println(maxLen);

                return;
            }
            else if(arr[left]>=arr[right]){
                totalSum-=arr[left];
                left++;
            }
            else{
                totalSum -=arr[right];
                right--;
            }
        }
        System.out.println(maxLen);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 100, 1, 1, 1};
        int k = 3;
        longestSubarray(arr,k);
    }
}
