package Arrays;

public class sortedTwoSum {
    public static void twoSum(int [] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(left);
                System.out.println(right);
                return ;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int target = 6;
        twoSum(arr,target);
    }
}
